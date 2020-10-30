package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class AoyoGroupComment {

  private long groupCommentId;
  private long groupId;
  private long orderId;
  private long customId;
  private String groupCommentTitle;
  private String groupCommentContent;
  private java.sql.Timestamp groupCommentTime;
  private java.sql.Timestamp groupCommentLastupdateTime;
  private String groupCommentRemarks;
  private Integer pingfen;
  private long deleteFlag;


}
