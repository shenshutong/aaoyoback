package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class AoyoCommodityImg {

  private int commodity_img_id;
  private int commodity_id;
  private String commodity_img_desc;
  private String commodity_img_url;
  private int commodity_img_index;
  private int commodity_img_sort;
  private int commodity_img_status;
  private Date commodityImg_lastupdate_time;
  private int delete_flag;
}
