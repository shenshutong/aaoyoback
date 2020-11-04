package com.bgs.aoyoback.pojo;


import lombok.Data;

import java.util.Date;
@Data
public class AoyoCoupon {
  private Integer couponId;
  private String couponNotImgUrl;
  private String couponUsedImgUrl;
  private String couponExpiredImgUrl;
  private String couponName;
  private Integer couponTypeId;
  private String couponDesc;
  private double couponAmt;
  private String couponJson;
  private Integer couponGroupId;
  private Integer couponTotalCount;
  private Integer couponCustomCount;
  private Date couponStartTime;
  private Date couponEndTime;
  private Date couponCreatTime;
  private String couponStatusId;
  private Integer couponValidId;
  private Integer deleteFlag;
  private Integer couponValidSecond;
  private double couponFullLess;
  private AoyoCouponType aoyoCouponType;
  private AoyoCouponUser aoyoCouponUser;
}
