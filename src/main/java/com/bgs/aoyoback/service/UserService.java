package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoUser;

public interface UserService {
    AoyoUser userlogin(String phone, String password);
}
