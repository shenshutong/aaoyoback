package com.bgs.aoyoback.controller;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.bgs.aoyoback.pojo.AuthTokenModel;
import com.bgs.aoyoback.response.BaseResponse;
import com.bgs.aoyoback.response.StatusCode;
import com.bgs.aoyoback.service.TokenService;
import com.bgs.aoyoback.utils.AliyunSmsUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("/token")
public class TokenController {
    @Autowired
    private TokenService tokenService;
    Jedis jedis = new Jedis("127.0.0.1");

    //用户登录
    @RequestMapping("/userlogin")
    @ResponseBody
    public BaseResponse userlogin(@RequestParam String phone, @RequestParam String password) {
        //判断手机号或密码是否为空
        if (StringUtils.isBlank(phone) || StringUtils.isBlank(password)) {
            //提示手机号 密码不能为空
            return new BaseResponse(StatusCode.UserNamePasswordNotBlank);
        }
        BaseResponse<AuthTokenModel> baseResponse = new BaseResponse<>(StatusCode.Success);

        try {
            //创建并登录token
            baseResponse.setData(tokenService.verifyUserAcreateToken(phone,password));
        }catch (Exception e){
            return new BaseResponse<>(StatusCode.Fail.getCode(),e.getMessage());
        }
        return baseResponse;
    }
    /**
     * 访问需要被授权的资源
     * @return
     */
    @RequestMapping(value = "token/auth",method = RequestMethod.GET)
    public BaseResponse tokenAuth(){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            String info="访问需要被拦截的链接/资源";
            response.setData(info);
        }catch (Exception e){
            response=new BaseResponse(StatusCode.Fail.getCode(),e.getMessage());
        }
        return response;
    }

    /**
     * 访问不需要被授权的资源
     * @return
     */
    @RequestMapping(value = "token/unauth",method = RequestMethod.GET)
    public BaseResponse tokenUnauth(){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            String info="访问不需要被拦截的链接/资源";
            response.setData(info);

        }catch (Exception e){
            response=new BaseResponse(StatusCode.Fail.getCode(),e.getMessage());
        }
        return response;
    }


    @RequestMapping("/getCode")
    @ResponseBody
    public void getCode(String phone) throws ClientException {
        AliyunSmsUtil aliyunSmsUtil = new AliyunSmsUtil();
        aliyunSmsUtil.setNewcode();
        String code = Integer.toString(aliyunSmsUtil.getNewcode());
        SendSmsResponse sendSms = aliyunSmsUtil.sendSms(phone,code);
        jedis.set("code",code);
        //SendSmsResponse sendSms = sendSms(phone, code);//填写你需要
        System.out.println("短信接口返回的数据----------------");
        System.out.println("Code=" + sendSms.getCode());
        System.out.println("Message=" + sendSms.getMessage());
        System.out.println("RequestId=" + sendSms.getRequestId());
        System.out.println("BizId=" + sendSms.getBizId());

    }

    @ResponseBody
    @RequestMapping("/phoneLogin")
    public BaseResponse phoneLogin(String code,String mobile){

         String scode = jedis.get("code");
         if (scode.equals(code)){
             return new BaseResponse(200,"登录成功");
         }
        return new BaseResponse(-1,"登录失败");
    }



}
