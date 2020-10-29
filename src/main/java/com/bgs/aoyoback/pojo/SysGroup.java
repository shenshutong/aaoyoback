package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class SysGroup {

  private long groupId;
  private long groupParentId;
  private long groupType;
  private long groupLevel;
  private long groupCreatorGroupId;
  private long countyId;
  private long groupStatus;
  private String groupName;
  private String groupDesc;
  private String groupCreator;
  private java.sql.Timestamp groupCreateTime;
  private java.sql.Timestamp groupUpdateTime;
  private String groupTel;
  private String groupLeader;
  private String groupLeaderTel;
  private String groupAddress;
  private String groupLongitude;
  private String groupLatitude;
  private String groupCodeImage;
  private long groupCode;
  private String groupBank;
  private String groupBankAccount;
  private String groupLeaderAccount;
  private String groupIcon;
  private long groupSaleId;
  private String groupImg;
  private long cardId;
  private long loginFlag;
  private long showFlag;
  private long etcFlag;
  private long deleteFlag;
  private String groupEncode;
  private String groupAlias;
  private long parentPayStatus;
  private java.sql.Timestamp deleteTime;
  private String deleteDesc;
  private long deleteUserId;
  private String deleteUserName;
  private String groupRoadName;
  private String groupCodeNum;
  private String groupLegalPersonImgJust;
  private String groupLegalPersonImgBack;
  private String certificatesImgurlOne;
  private String certificatesImgurlTwo;
  private long certificatesStatus;
  private double groupIncomeRatio;
  private long addressId;

  private SysGroupAddress SysGroupAddress;//地址

  private String groupAddressDetails;

  private List<AoyoGroupComment> AoyoGroupComment;
  private Integer pingfen;//评分
  private Integer zongdingdan;//总订单

}
