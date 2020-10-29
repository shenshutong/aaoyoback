package com.bgs.aoyoback.pojo;

import lombok.Data;

import java.util.Date;

@Data
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
}
