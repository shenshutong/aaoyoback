package com.bgs.aoyoback.pojo;

import lombok.Data;

@Data
public class AoyoShoppingCart {

  private int shoppingCartId;
  private int customId;
  private int commodityId;
  private int groupId;
  private int joinShoppingCartCount;
  private double joinShoppingCartPrice;
  private int joinShoppingCartTime;
  private int updateTime;
  private int enabledStatic;
  private int deleteFlag;


}
