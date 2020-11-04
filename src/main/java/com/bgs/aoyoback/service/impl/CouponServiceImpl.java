package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.CouponMapper;
import com.bgs.aoyoback.pojo.AoyoCoupon;
import com.bgs.aoyoback.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponMapper couponMapper;

    @Override
    public List<AoyoCoupon> getCouponList() {
        return couponMapper.getCouponList();
    }

    @Override
    public int getCoupon(Integer id) {
        if(couponMapper.selectCoupon(id)!=null){
            return 0;
        }
        return couponMapper.getCoupon(id);
    }
}
