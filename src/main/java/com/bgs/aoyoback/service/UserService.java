package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoShoppingCart;
import com.bgs.aoyoback.pojo.AoyoUser;

import java.util.List;

public interface UserService {
    AoyoUser userlogin(String phone, String password);

}
