package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AuthTokenModel;
import com.bgs.aoyoback.response.BaseResponse;

public interface TokenService {
    AuthTokenModel verifyUserAcreateToken(String phone, String password) throws  Exception;

    //用户身份验证
    BaseResponse validateToken(String accessToken);
}
