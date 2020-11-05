package com.bgs.aoyoback.pojo;


public class AoyoCommodityNorms {

  private long normsId;
  private long commodityId;
  private long groupId;
  private long classId;
  private String normsName;
  private String normsValue;
  private long deleteFlag;


  public long getNormsId() {
    return normsId;
  }

  public void setNormsId(long normsId) {
    this.normsId = normsId;
  }


  public long getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(long commodityId) {
    this.commodityId = commodityId;
  }


  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }


  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }


  public String getNormsName() {
    return normsName;
  }

  public void setNormsName(String normsName) {
    this.normsName = normsName;
  }


  public String getNormsValue() {
    return normsValue;
  }

  public void setNormsValue(String normsValue) {
    this.normsValue = normsValue;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
