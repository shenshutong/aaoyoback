package com.bgs.aoyoback.pojo;

import lombok.Data;

@Data
public class AoyoPlatformImage {

  private Integer platformImageId;
  private String platformImageName;
  private String platformImageDesc;
  private String platformImageUri;
  private Integer serialNumber;
  private Integer platformImageStatus;
  private java.sql.Timestamp creatTime;
  private Integer deleteFlag;
}
