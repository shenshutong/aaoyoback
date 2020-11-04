package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.config.Result;
import com.bgs.aoyoback.pojo.AoyoCoupon;
import com.bgs.aoyoback.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @RequestMapping("getCouponList")
    public Result getCouponList(){
        List<AoyoCoupon> couponList = couponService.getCouponList();
        return new Result(true,200,"查询成功",couponList);
    }
    @RequestMapping("getCoupon")
    public Result getCoupon(Integer id){
        int i = couponService.getCoupon(id);
        if (i==0){
            return new Result(false,500,"领取失败，您已经领取过该福利");
        }
        return new Result(true,200,"领取成功");
    }


}
