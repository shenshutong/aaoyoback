package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AoyoGroupCommodity {

  private long groupCommentId;
  private long commodityId;
  private long orderId;
  private long customId;
  private String groupCommentTitle;
  private String groupCommentContent;
  private java.sql.Timestamp groupCommentTime;
  private java.sql.Timestamp groupCommentLastupdateTime;
  private String groupCommentRemarks;
  private long pingfen;
  private long deleteFlag;


}
