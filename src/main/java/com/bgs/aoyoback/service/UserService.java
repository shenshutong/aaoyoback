package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoCoupon;
import com.bgs.aoyoback.pojo.AoyoOrder;
import com.bgs.aoyoback.pojo.AoyoPlatformImage;
import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.response.BaseResponse;

import java.util.List;


public interface UserService {
   // AoyoUser userlogin(String phone, String password);

    //验证手机号与密码
    AoyoUser verifyUser(String phone, String password);

    //查询用户信息
    AoyoUser showUserInfo(Integer id);

    int uploadPhoto(AoyoPlatformImage platformImage);

    //查看订单信息
    List<AoyoOrder> showOrderList();

    List<AoyoCoupon> showMyDiscount();

    //删除订单
    int deleteOrder(Integer orderId);

    //查看订单详情
    AoyoOrder showOrderDetail(Integer id);
}
