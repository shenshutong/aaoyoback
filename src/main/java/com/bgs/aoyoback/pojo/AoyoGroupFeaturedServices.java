package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AoyoGroupFeaturedServices {

  private long featuredServicesId;
  private String featuredServicesName;
  private String featuredServicesDesc;
  private String featuredServicesRemarks;
  private long featuredServicesIsenable;
  private long deleteFlag;
  private java.sql.Timestamp createTime;



}
