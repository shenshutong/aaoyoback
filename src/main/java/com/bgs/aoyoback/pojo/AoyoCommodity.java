package com.bgs.aoyoback.pojo;


public class AoyoCommodity {

  private long commodityId;
  private String commodityNumber;
  private String commodityName;
  private long brandId;
  private long typeId;
  private long groupId;
  private double commdityWeight;
  private double commoditySellingPrice;
  private double commodityCostPrice;
  private long commodityStatus;
  private java.sql.Timestamp commodityComeOutTime;
  private String commodityDesc;
  private java.sql.Timestamp commodityEntry;
  private java.sql.Timestamp commodityLastupdateTime;
  private long commoditySort;
  private long deleteFlag;


  public long getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(long commodityId) {
    this.commodityId = commodityId;
  }


  public String getCommodityNumber() {
    return commodityNumber;
  }

  public void setCommodityNumber(String commodityNumber) {
    this.commodityNumber = commodityNumber;
  }


  public String getCommodityName() {
    return commodityName;
  }

  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }


  public double getCommdityWeight() {
    return commdityWeight;
  }

  public void setCommdityWeight(double commdityWeight) {
    this.commdityWeight = commdityWeight;
  }


  public double getCommoditySellingPrice() {
    return commoditySellingPrice;
  }

  public void setCommoditySellingPrice(double commoditySellingPrice) {
    this.commoditySellingPrice = commoditySellingPrice;
  }


  public double getCommodityCostPrice() {
    return commodityCostPrice;
  }

  public void setCommodityCostPrice(double commodityCostPrice) {
    this.commodityCostPrice = commodityCostPrice;
  }


  public long getCommodityStatus() {
    return commodityStatus;
  }

  public void setCommodityStatus(long commodityStatus) {
    this.commodityStatus = commodityStatus;
  }


  public java.sql.Timestamp getCommodityComeOutTime() {
    return commodityComeOutTime;
  }

  public void setCommodityComeOutTime(java.sql.Timestamp commodityComeOutTime) {
    this.commodityComeOutTime = commodityComeOutTime;
  }


  public String getCommodityDesc() {
    return commodityDesc;
  }

  public void setCommodityDesc(String commodityDesc) {
    this.commodityDesc = commodityDesc;
  }


  public java.sql.Timestamp getCommodityEntry() {
    return commodityEntry;
  }

  public void setCommodityEntry(java.sql.Timestamp commodityEntry) {
    this.commodityEntry = commodityEntry;
  }


  public java.sql.Timestamp getCommodityLastupdateTime() {
    return commodityLastupdateTime;
  }

  public void setCommodityLastupdateTime(java.sql.Timestamp commodityLastupdateTime) {
    this.commodityLastupdateTime = commodityLastupdateTime;
  }


  public long getCommoditySort() {
    return commoditySort;
  }

  public void setCommoditySort(long commoditySort) {
    this.commoditySort = commoditySort;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

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

  private List<AoyoGroupCommodity> aoyoGroupCommodity;
  private List<AoyoCommodityNorms> aoyoCommodityNorms;

  private String commodityImgUrl;
}
