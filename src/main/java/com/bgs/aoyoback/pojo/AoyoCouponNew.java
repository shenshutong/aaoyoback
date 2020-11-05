package com.bgs.aoyoback.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoCouponNew {

  private Integer couponNewId;
  private String couponNewName;
  private Integer couponNewCount;
  private Integer couponNewTypeId;
  private double couponNewTypeAtribute;
  private Integer couponNewRebateMax;
  private Integer couponNewSill;
  private Integer couponNewSillNum;
  private String couponNewDesc;
  private Integer couponNewStatus;
  private String couponNewStatusAtribute;
  private Integer groupId;
  private Integer couponNewLimit;
  private Date couponNewStartTime;
  private Date couponNewEndTime;
  private Date couponNewCreateTime;
  private Integer deleteFlag;
  private AoyoCouponNewType aoyoCouponNewType;
  private AoyoCoupon aoyoCoupon;
}
