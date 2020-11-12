package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AoyoCommodityStock {

  private Integer commodityStockId;
  private Integer commodityId;
  private Integer commodityStockNumber;
  private Integer deleteFlag;
  private Integer group_id;


}
