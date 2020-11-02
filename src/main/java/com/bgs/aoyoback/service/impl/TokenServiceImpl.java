package com.bgs.aoyoback.service.impl;

import com.alibaba.fastjson.JSON;
import com.bgs.aoyoback.dao.TokenMapper;
import com.bgs.aoyoback.dto.AccessTokenDto;
import com.bgs.aoyoback.pojo.AoyoAuthToken;
import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.pojo.AuthTokenModel;
import com.bgs.aoyoback.response.BaseResponse;
import com.bgs.aoyoback.response.StatusCode;
import com.bgs.aoyoback.service.TokenService;
import com.bgs.aoyoback.service.UserService;
import com.bgs.aoyoback.utils.Constant;
import com.bgs.aoyoback.utils.EncryptUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;

@Service
public class TokenServiceImpl implements TokenService {
    private static final Logger log = LoggerFactory.getLogger(TokenService.class);
    @Autowired
    private UserService userService;

    @Autowired
    private TokenMapper tokenMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    Jedis jedis = new Jedis("127.0.0.1");

    //登录并创建token
    @Override
    @Transactional
    public AuthTokenModel verifyUserAcreateToken(String phone, String password) throws Exception {
        AoyoUser user = userService.verifyUser(phone, password);


        if (user != null) {
            //失效以前仍可使用
            tokenMapper.updateActiveByUserId(user.getAoyoId());
            //创建token对象
            AccessTokenDto accessTokenDto =
                    new AccessTokenDto(user.getAoyoId(), phone, System.currentTimeMillis(),
                            Constant.snowFlake.nextId().toString(), Constant.ACCESS_TOKEN_EXPIRE);
            //将对象转为字符串
            String accessTokenToString = objectMapper.writeValueAsString(accessTokenDto);

            //给字符串加密
            String accessToken = EncryptUtil.aesEncrypt(accessTokenToString, Constant.TOKEN_AUTH_KEY);


            //创建token存储到数据库
            AoyoAuthToken authToken = new AoyoAuthToken();
            authToken.setAoyoUserId(user.getAoyoId());
            authToken.setAccessToken(accessToken);
            authToken.setAccessExpire(Constant.ACCESS_TOKEN_EXPIRE);
            authToken.setTokenTimestamp(System.currentTimeMillis());
            authToken.setCreateTime(DateTime.now().toDate());

            //将token存到数据库
            String jsontoken = JSON.toJSONString(authToken);
            System.out.println(jsontoken);
            jedis.set("token",jsontoken);
            //设置过期时间
            jedis.expire("user",100000);

            //tokenMapper.initTokenInfo(authToken);
            System.out.println(authToken);

            AuthTokenModel authTokenModel = new AuthTokenModel(accessToken, Constant.ACCESS_TOKEN_EXPIRE);
            return authTokenModel;

        }


        return null;
    }


    //验证token
    @Override
    public BaseResponse validateToken(String accessToken) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.Success);
        //如果accesstoken为空
        if (StringUtils.isBlank(accessToken)){
            //如果为空，提示填入
            return new BaseResponse(StatusCode.AccessTokenNotBlank);
        }
        //数据库查询accesstoken
        AoyoAuthToken aoyoAuthToken = tokenMapper.findAccessToken(accessToken);

        //若果查询不到
        if (aoyoAuthToken==null){
            //提示accesstoken不存在
            return new BaseResponse(StatusCode.AccessTokenNotExist);
        }

        //为了防止token伪造,会额外做异步操作解析token
        AccessTokenDto tokenDto;

        try {
            tokenDto = parseAccessToken(accessToken);
        }catch (Exception e){
            return new BaseResponse(StatusCode.AccessTokenInvalidate);
        }

        if (tokenDto!=null){
            //判断token是否过期
            if (System.currentTimeMillis()-tokenDto.getTimestamp()>tokenDto.getExpire()){
                //失效的token
                this.invalidateByAccessToken(accessToken);
                //如果过期，提示已过期
                return new BaseResponse(StatusCode.TokenValidateExpireToken);

            }

        }
        return baseResponse;
    }

    //失效token
    private void invalidateByAccessToken(String accessToken) {
        //如果accesstoken为空
        if (StringUtils.isBlank(accessToken)){
            //注销
            tokenMapper.invalidateByAccessToken(accessToken);
        }
    }

    //解析token
    public AccessTokenDto parseAccessToken(String accessToken) throws Exception {
        String tokenJsonStr = EncryptUtil.aesDecrypt(accessToken, Constant.TOKEN_AUTH_KEY);
        return objectMapper.readValue(tokenJsonStr,AccessTokenDto.class);
    }
}
