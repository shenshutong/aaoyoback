package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoCoupon;
import com.bgs.aoyoback.pojo.AoyoCouponNew;

import java.util.List;

public interface CouponService {

    int getCoupon(AoyoCoupon aoyoCoupon);

    List<AoyoCouponNew> getCouponNewList();
}
