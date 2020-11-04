package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCoupon;
import com.bgs.aoyoback.pojo.AoyoCouponUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CouponMapper {
    List<AoyoCoupon> getCouponList();

    int getCoupon(@Param("aoyoCouponId") Integer id);

    AoyoCouponUser selectCoupon(@Param("aoyoCouponId")Integer id);
}
