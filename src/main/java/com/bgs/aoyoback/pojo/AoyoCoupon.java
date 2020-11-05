package com.bgs.aoyoback.pojo;


import com.bgs.aoyoback.pojo.AoyoCouponNew;
import com.bgs.aoyoback.pojo.AoyoCouponNewType;
import lombok.Data;

import java.util.Date;

@Data
public class AoyoCoupon {

  private Integer couponId;
  private Integer couponNewId;
  private Integer userId;
  private String couponNotImgUrl;
  private String couponUsedImgUrl;
  private String couponExpiredImgUrl;
  private Date couponCreatTime;
  private String couponStatus;
  private Integer deleteFlag;
  private AoyoCouponNew aoyoCouponNew;
  private AoyoCouponNewType aoyoCouponNewType;
}
