package com.bgs.aoyoback.pojo;


import lombok.Data;

import java.util.Date;
@Data
public class AoyoPanel {

  private Integer panelId;
  private String jumpPath;
  private String typeName;
  private Date creatTime;
  private Integer typeId;
  private Integer panelType;
  private String panelName;
  private Integer sort;
  private String panelUrl;
  private Integer deleteFlag;


}
