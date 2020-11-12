package com.bgs.aoyoback.pojo;

import lombok.Data;

@Data
public class AoyoCommodityNorms {

  private Integer normsId;
  private Integer commodityId;
  private Integer groupId;
  private Integer classId;
  private String normsName;
  private String normsValue;
  private Integer deleteFlag;

}
