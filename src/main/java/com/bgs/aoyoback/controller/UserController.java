package com.bgs.aoyoback.controller;


import com.alibaba.fastjson.JSON;
import com.bgs.aoyoback.pojo.*;
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
    public AoyoUser showUserInfo() {
        String suser = jedis.get("user");
        //String sphone = jedis.get("phone");
        AoyoUser aoyoUser = JSON.parseObject(suser, AoyoUser.class);
        Integer id = aoyoUser.getAoyoId();

        AoyoUser user = userService.showUserInfo(id);
        return user;
    }


    //头像修改
    @ResponseBody
    @RequestMapping("/uploadPhoto")
    public Map<String, Object> uploadPhoto(MultipartFile file) throws IOException {
        String suser = jedis.get("user");
        AoyoUser aoyoUser = JSON.parseObject(suser, AoyoUser.class);
        Integer id = aoyoUser.getAoyoId();
        Map<String, Object> map = new HashMap<>();
        List<AoyoPlatformImage> list = new ArrayList<>();

        AoyoPlatformImage platformImage = new AoyoPlatformImage();
        String ph = file.getOriginalFilename();//获取上传文件名称
        String fileName = sdf.format(new Date()) + "_1";
        File file1 = new File(fileName + ph);
        FileOutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(ph.getBytes());
        outputStream.close();
        String temp = AliyunOSSUtil.upload(file1);
        platformImage.setPlatformImageName(fileName);
        platformImage.setPlatformImageUri(temp);
        platformImage.setAoyoUserId(id);

        int i = userService.uploadPhoto(platformImage);
        return map;
    }


    //查看订单列表
    @RequestMapping("showOrderList")
    @ResponseBody
    public List<AoyoOrder> showOrderList() {

        List<AoyoOrder> list = userService.showOrderList();
        return list;
    }

    //删除订单
    @ResponseBody
    @RequestMapping("deleteOrder")
    public Boolean deleteOrder(Integer orderId) {
        int i = userService.deleteOrder(orderId);
        if (i > 0) {
            return true;
        }
        return false;
    }

    //查看订单详情
    @RequestMapping("showOrderDetail")
    @ResponseBody
    public List<AoyoOrder> showOrderDetail(Integer id) {
        return userService.showOrderDetail(id);

    }

    //优惠券展示
    @RequestMapping("showMyDiscount")
    @ResponseBody
    public List<AoyoCoupon> showMyDiscount() {
        return userService.showMyDiscount();
    }

    //优惠券数量
    @ResponseBody
    @RequestMapping("/discountCount")
    public BaseResponse discountCount() {
        int i = userService.discountCount();
        System.out.println(i);
        return new BaseResponse(200, "查询成功", i);
    }

    //关注商品
    @RequestMapping("/commodityCollection")
    @ResponseBody
    public BaseResponse commodityCollection(){
        List<AoyoCommodityCollection> list = userService.commodityCollection();
        if (list==null){
            return new BaseResponse(-1,"查询失败","error");
        }
        return new BaseResponse(200,"查询成功",list);
    }

    //关注商品数量
    @ResponseBody
    @RequestMapping("/collectionCount")
    public BaseResponse collectionCount(){
        int i = userService.collectionCount();
        if (i>0){
            return new BaseResponse(200,"成功",i);
        }
        return new BaseResponse(-1,"失败","error");
    }

    //取消关注
    @RequestMapping("/deleteCollection")
    @ResponseBody
    public BaseResponse deleteCollection(Integer collectionId){
        int i = userService.deleteCollection(collectionId);
        if (i>0){
            return new BaseResponse(200,"删除成功",i);
        }
        return new BaseResponse(-1,"删除失败","error");

    }

}
