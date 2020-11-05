package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCoupon;
import com.bgs.aoyoback.pojo.AoyoCouponNew;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CouponMapper {

    int getCoupon(AoyoCoupon aoyoCoupon);

    AoyoCoupon selectCoupon(@Param("aoyoCouponNewId")Integer id);

    List<AoyoCouponNew> getCouponNewList();
}
