package com.bgs.aoyoback.pojo;


import lombok.Data;

import java.util.Date;
@Data
public class AoyoGallery {

  private Integer id;
  private Date createtime;
  private String aoyoAlblumInfo;
  private String aoyoAlblumCover;
  private Integer aoyoUserId;


}
