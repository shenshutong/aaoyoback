package com.bgs.aoyoback.pojo;

import lombok.Data;

@Data
public class AoyoCommodityImg {

  private Integer commodityImgId;
  private Integer commodityId;
  private String commodityImgDesc;
  private String commodityImgUrl;
  private Integer commodityImgIndex;
  private Integer commodityImgSort;
  private Integer commodityImgStatus;
  private java.sql.Timestamp commodityImgLastupdateTime;
  private Integer deleteFlag;
}
