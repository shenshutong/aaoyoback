package com.bgs.aoyoback.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@ToString
public class AoyoCommodity {

  private Integer commodityId;
  private String commodityNumber;
  private String commodityName;
  private Integer brandId;
  private Integer typeId;
  private Integer groupId;
  private double commdityWeight;
  private double commoditySellingPrice;
  private double commodityCostPrice;
  private Integer commodityStatus;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String commodityComeOutTime;
  private String commodityDesc;
  private String commodityEntry;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String commodityLastupdateTime;
  private Integer commoditySort;
  private Integer deleteFlag;
  private Integer commoditySuitId;
  private AoyoCommodityImg aoyoCommodityImg;
  private String activeT;
  private String orderBy;
}
