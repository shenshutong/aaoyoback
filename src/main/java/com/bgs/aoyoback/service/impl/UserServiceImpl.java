package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.UserMapper;
import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public AoyoUser userlogin(String phone, String password) {
        return userMapper.userlogin(phone,password);
    }
}
