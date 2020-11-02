package com.bgs.aoyoback.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
public class AoyoCommoditySuit {

  private Integer commoditySuitId;
  private String commoditySuitName;
  private Integer groupId;
  private Integer typeId;
  private double commoditySellingPrice;
  private double commodityCostPrice;
  private Integer commodityStatus;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String commodityComeOutTime;
  private String commoditySuitDesc;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String commodityEntryTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String commodityLastupdateTime;
  private Integer commoditySort;
  private Integer deleteFlag;
  private Integer aoyoUserId;
  private List<AoyoCommodity> aoyoCommoditylist;
  private String commodityImgUrl;
}
