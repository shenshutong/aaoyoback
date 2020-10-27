package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userlogin")
    @ResponseBody
    public AoyoUser userlogin(String phone,String password){
        AoyoUser user = userService.userlogin(phone,password);
        return user;
    }
}
