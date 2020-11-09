package com.bgs.aoyoback.service.impl;

import com.alibaba.fastjson.JSON;
import com.bgs.aoyoback.dao.UserMapper;
import com.bgs.aoyoback.pojo.*;
import com.bgs.aoyoback.response.BaseResponse;
import com.bgs.aoyoback.response.StatusCode;
import com.bgs.aoyoback.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    Jedis jedis = new Jedis("127.0.0.1");


    //验证手机号与密码
    @Override
    public AoyoUser verifyUser(String phone, String password) {
        //判断账号密码是否为空
        if (StringUtils.isBlank(phone) || StringUtils.isBlank(password)){
            throw new  RuntimeException("账号密码不能为空");
        }

        AoyoUser user = userMapper.selectUserInfo(phone);
        /*String juser = JSON.toJSONString(user);
        jedis.set("user",juser);*/


        if (user==null){
            throw  new RuntimeException("当前账号未注册");
        }
        if (!password.equals(user.getAoyoPassword())){
            throw new RuntimeException("密码输入有误，请重新输入");
        }
        return user;

    }

    //查询用户信息
    @Override
    public AoyoUser showUserInfo(Integer id) {


        //从redis中取出token
        String token = jedis.get("token");
        //判断token是否为空
        if (StringUtils.isBlank(token)){
            throw new RuntimeException("未登录，请登录");
        }
        return userMapper.showUserInfo(id);
    }

    @Override
    public int uploadPhoto(AoyoPlatformImage platformImage) {
        return userMapper.uploadPhoto(platformImage);
    }

    //订单列表
    @Override
    public List<AoyoOrder> showOrderList() {
        return userMapper.showOrderList();
    }

    @Override
    public List<AoyoCoupon> showMyDiscount() {
        return userMapper.showMyDiscount();
    }

    //删除订单
    @Override
    public int deleteOrder(Integer orderId) {
        return userMapper.deleteOrder(orderId);
    }

    //订单详情
    @Override
    public List<AoyoOrder> showOrderDetail(Integer id) {
        return userMapper.showOrderDetail(id);
    }

    @Override
    public int discountCount() {
        return userMapper.discountCount();
    }

    //关注商品
    @Override
    public List<AoyoCommodityCollection> commodityCollection() {
        return userMapper.commodityCollection();
    }

    //关注商品数量
    @Override
    public int collectionCount() {
        return userMapper.collectionCount();
    }

    //取消关注
    @Override
    public int deleteCollection(Integer collectionId) {
        return userMapper.deleteCollection(collectionId);
    }


}
