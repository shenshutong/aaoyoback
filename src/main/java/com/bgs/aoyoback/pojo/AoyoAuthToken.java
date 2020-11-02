package com.bgs.aoyoback.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoAuthToken {

  private Integer id;
  private Integer AoyoUserId;
  private String accessToken;
  //过期时间
  private Long accessExpire;

  //时间戳
  private Long tokenTimestamp;

  //是否有效
  private Byte isActive=1;

  private Date createTime;
  private Date updateTime;




}
