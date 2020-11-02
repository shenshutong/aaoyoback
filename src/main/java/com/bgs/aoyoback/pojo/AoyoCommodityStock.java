package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AoyoCommodityStock {

  private long commodityStockId;
  private long commodityId;
  private long groupId;
  private String commodityStockTypeName;
  private long commodityStockNumber;
  private long deleteFlag;


}
