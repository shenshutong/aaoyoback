package com.bgs.aoyoback.pojo;


public class AoyoCommodityClass {

  private long classId;
  private String className;
  private long groupId;
  private long parentClassId;
  private String classDesc;
  private long statusId;
  private double classIncomeRatio;
  private long classIsoriginal;
  private long deleteFlag;


  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }


  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }


  public long getParentClassId() {
    return parentClassId;
  }

  public void setParentClassId(long parentClassId) {
    this.parentClassId = parentClassId;
  }


  public String getClassDesc() {
    return classDesc;
  }

  public void setClassDesc(String classDesc) {
    this.classDesc = classDesc;
  }


  public long getStatusId() {
    return statusId;
  }

  public void setStatusId(long statusId) {
    this.statusId = statusId;
  }


  public double getClassIncomeRatio() {
    return classIncomeRatio;
  }

  public void setClassIncomeRatio(double classIncomeRatio) {
    this.classIncomeRatio = classIncomeRatio;
  }


  public long getClassIsoriginal() {
    return classIsoriginal;
  }

  public void setClassIsoriginal(long classIsoriginal) {
    this.classIsoriginal = classIsoriginal;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
