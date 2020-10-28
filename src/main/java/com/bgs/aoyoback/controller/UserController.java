package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.service.UserService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //用户登录
    @RequestMapping("/userlogin")
    @ResponseBody
    public AoyoUser userlogin(String phone, String password, HttpSession session){
        AoyoUser user = userService.userlogin(phone,password);
        if (user!=null){
            session.setAttribute("user",user);
        }
        return user;
    }

    //退出
    /*@ResponseBody
    @RequestMapping("/editlogin")
    public String editlogin(HttpSession session){
        session.removeAttribute("user");
        session.invalidate();
        return "";

    }*/
}
