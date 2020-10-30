package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class AoyoShoppingCart {

  private int shopping_cart_id;
  private int custom_id;
  private int commodity_id;
  private int group_id;
  private int join_shopping_cart_count;
  private double join_shopping_cart_price;
  private Date join_shopping_cart_time;
  private Date update_time;
  private int enabled_static;
  private int delete_flag;

}
