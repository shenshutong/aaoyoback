package com.bgs.aoyoback.controller;


import com.alibaba.fastjson.JSON;
import com.bgs.aoyoback.pojo.AoyoPlatformImage;
import com.bgs.aoyoback.pojo.AoyoUser;
import com.bgs.aoyoback.response.BaseResponse;
import com.bgs.aoyoback.service.UserService;
import com.bgs.aoyoback.utils.AliyunOSSUtil;
import com.bgs.aoyoback.utils.AliyunSmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import redis.clients.jedis.Jedis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/user")
public class UserController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    @Autowired
    private UserService userService;
    Jedis jedis = new Jedis("127.0.0.1");

    //查询用户信息
    @RequestMapping("showUserInfo")
    @ResponseBody
    public AoyoUser showUserInfo(){
        String suser = jedis.get("user");
        //String sphone = jedis.get("phone");
        AoyoUser aoyoUser = JSON.parseObject(suser,AoyoUser.class);
        Integer id = aoyoUser.getAoyoId();

        AoyoUser user = userService.showUserInfo(id);
        return user;
    }



    //头像修改
    @ResponseBody
    @RequestMapping("/uploadPhoto")
    public Map<String,Object> uploadPhoto(MultipartFile photo) throws IOException {
        String suser = jedis.get("user");
        AoyoUser aoyoUser = JSON.parseObject(suser,AoyoUser.class);
        Integer id = aoyoUser.getAoyoId();
        Map<String, Object> map = new HashMap<>();
        List<AoyoPlatformImage> list = new ArrayList<>();

        AoyoPlatformImage platformImage = new AoyoPlatformImage();
        String ph = photo.getOriginalFilename();//获取上传文件名称
        String fileName = sdf.format(new Date()) + "_1";
        File file = new File(fileName+ph);
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(ph.getBytes());
        outputStream.close();
        String temp = AliyunOSSUtil.upload(file);
        platformImage.setPlatformImageName(fileName);
        platformImage.setPlatformImageUri(temp);
        platformImage.setAoyoUserId(id);

        int i = userService.uploadPhoto(platformImage);
        return map;
    }



}
