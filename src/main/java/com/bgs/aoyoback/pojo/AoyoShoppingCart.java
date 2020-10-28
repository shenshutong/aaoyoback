package com.bgs.aoyoback.pojo;


import lombok.Data;
import lombok.ToString;

import java.util.Date;
@ToString
public class AoyoShoppingCart {

  private int shoppingCartId;
  private int customId;
  private int commodityId;
  private int groupId;
  private int joinShoppingCartCount;
  private double joinShoppingCartPrice;
  private Date joinShoppingCartTime;
  private Date updateTime;
  private int enabledStatic;
  private int deleteFlag;
  private String cdname;
  private String grname;

  public String getCdname() {
    return cdname;
  }

  public void setCdname(String cdname) {
    this.cdname = cdname;
  }

  public String getGrname() {
    return grname;
  }

  public void setGrname(String grname) {
    this.grname = grname;
  }

  public int getShoppingCartId() {
    return shoppingCartId;
  }

  public void setShoppingCartId(int shoppingCartId) {
    this.shoppingCartId = shoppingCartId;
  }


  public int getCustomId() {
    return customId;
  }

  public void setCustomId(int customId) {
    this.customId = customId;
  }


  public int getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(int commodityId) {
    this.commodityId = commodityId;
  }


  public int getGroupId() {
    return groupId;
  }

  public void setGroupId(int groupId) {
    this.groupId = groupId;
  }


  public int getJoinShoppingCartCount() {
    return joinShoppingCartCount;
  }

  public void setJoinShoppingCartCount(int joinShoppingCartCount) {
    this.joinShoppingCartCount = joinShoppingCartCount;
  }


  public double getJoinShoppingCartPrice() {
    return joinShoppingCartPrice;
  }

  public void setJoinShoppingCartPrice(double joinShoppingCartPrice) {
    this.joinShoppingCartPrice = joinShoppingCartPrice;
  }


  public Date getJoinShoppingCartTime() {
    return joinShoppingCartTime;
  }

  public void setJoinShoppingCartTime(Date joinShoppingCartTime) {
    this.joinShoppingCartTime = joinShoppingCartTime;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public int getEnabledStatic() {
    return enabledStatic;
  }

  public void setEnabledStatic(int enabledStatic) {
    this.enabledStatic = enabledStatic;
  }


  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
