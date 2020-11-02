package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoUser;


public interface UserService {
   // AoyoUser userlogin(String phone, String password);

    //验证手机号与密码
    AoyoUser verifyUser(String phone, String password);
}
