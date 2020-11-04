package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoPlatformImage;
import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.response.BaseResponse;


public interface UserService {
   // AoyoUser userlogin(String phone, String password);

    //验证手机号与密码
    AoyoUser verifyUser(String phone, String password);

    //查询用户信息
    AoyoUser showUserInfo(Integer id);

    int uploadPhoto(AoyoPlatformImage platformImage);
}
