package com.bgs.aoyoback.pojo;


import java.sql.Timestamp;
import java.util.List;

public class AoyoAppClass {

  private Integer appClassId;
  private String appClassName;
  private String appClassDesc;
  private Timestamp createTime;
  private long appClassStatus;
  private long deleteFlag;




  public long getAppClassId() {
    return appClassId;
  }

  public void setAppClassId(Integer appClassId) {
    this.appClassId = appClassId;
  }


  public String getAppClassName() {
    return appClassName;
  }

  public void setAppClassName(String appClassName) {
    this.appClassName = appClassName;
  }


  public String getAppClassDesc() {
    return appClassDesc;
  }

  public void setAppClassDesc(String appClassDesc) {
    this.appClassDesc = appClassDesc;
  }


  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getAppClassStatus() {
    return appClassStatus;
  }

  public void setAppClassStatus(long appClassStatus) {
    this.appClassStatus = appClassStatus;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
