package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCoupon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CouponMapper {
    List<AoyoCoupon> getCouponList();
}
