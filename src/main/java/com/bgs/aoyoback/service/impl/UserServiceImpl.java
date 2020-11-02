package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.UserMapper;
import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    /*@Override
    public AoyoUser userlogin(String phone, String password) {
        return userMapper.userlogin(phone,password);
    }*/

    //验证手机号与密码
    @Override
    public AoyoUser verifyUser(String phone, String password) {
        //判断账号密码是否为空
        if (StringUtils.isBlank(phone) || StringUtils.isBlank(password)){
            throw new  RuntimeException("账号密码不能为空");
        }

        AoyoUser user = userMapper.selectUserInfo(phone);

        if (user==null){
            throw  new RuntimeException("当前账号未注册");
        }
        if (!password.equals(user.getAoyoPassword())){
            throw new RuntimeException("密码输入有误，请重新输入");
        }
        return user;

    }


}
