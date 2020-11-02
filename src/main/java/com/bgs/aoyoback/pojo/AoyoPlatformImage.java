package com.bgs.aoyoback.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class AoyoPlatformImage {

  private Integer platformImageId;
  private String platformImageName;
  private String platformImageDesc;
  private String platformImageUri;
  private Integer serialNumber;
  private Integer platformImageStatus;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String creatTime;
  private Integer deleteFlag;
}
