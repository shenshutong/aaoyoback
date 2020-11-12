package com.bgs.aoyoback.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoAddress {

  private Integer addressId;
  private Integer userId;
  private String consigneeName;
  private Integer addressLabelId;
  private String telephone;
  private Integer provinceId;
  private Integer cityId;
  private Integer areaId;
  private Integer streetId;
  private String addressDetails;
  private String postcode;
  private Integer addressStatus;
  private Integer defaultAddress;
  private Date creatTime;
  private Integer deleteFlag;

  private String labelName;
  //市
  private String cityname;
  //省
  private String pname;
  private String areaname;
  private String streetsname;

}
