package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoPlatformImage;
import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.response.BaseResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //AoyoUser userlogin(@Param("phone") String phone, @Param("password")String password);
    //验证手机号与密码
    AoyoUser selectUserInfo(String phone);

    //查询用户信息
    AoyoUser showUserInfo(Integer id);

    //修改头像
    int uploadPhoto(@Param("platformImage") AoyoPlatformImage platformImage);
}
