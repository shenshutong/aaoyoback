package com.bgs.aoyoback.pojo;


import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class AoyoCommodity {

  private int commodity_id;
  private String commodity_number;
  private String commodity_name;
  private int brand_id;
  private int type_id;
  private int group_id;
  private double commdity_weight;
  private double commodity_selling_price;
  private double commodity_cost_price;
  private int commodity_status;
  private Date commodity_come_out_time;
  private String commodity_desc;
  private Date commodity_entry;
  private Date commodity_lastupdate_time;
  private int commodity_sort;
  private int delete_flag;
  private int commodity_suit_id;



}
