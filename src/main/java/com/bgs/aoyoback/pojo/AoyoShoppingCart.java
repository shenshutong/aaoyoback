package com.bgs.aoyoback.pojo;


import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class AoyoShoppingCart {

  private Integer shoppingCartId;
  private Integer customId;
  private Integer commodityId;
  private Integer groupId;
  private Integer joinShoppingCartCount;
  private double joinShoppingCartPrice;
  private Date joinShoppingCartTime;
  private Date updateTime;
  private Integer enabledStatic;
  private Integer deleteFlag;
  private List<AoyoCommodity> commoditys;
  private List<AoyoCommodityImg> imgs;
  private String groupName;
}
