package com.bgs.aoyoback.pojo;

import lombok.Data;

@Data
public class SysUser {

  private int userId;
  private int groupId;
  private int roleId;
  private String userName;
  private String userPwd;
  private String userAlias;
  private String userTel;
  private String userWeixin;
  private String userQq;
  private String userEmail;
  private String userIdentity;
  private int userAddressId;
  private String userImagePath;
  private int countyId;
  private String userMac;
  private String userImei;
  private String userToken;
  private int loginFlag;
  private String loginDesc;
  private java.sql.Timestamp userLastLogin;
  private String loginUser;
  private int userSource;
  private String userCreator;
  private java.sql.Timestamp userCreateTime;
  private java.sql.Timestamp userUpdateTime;
  private String userWxOpenid;
  private String userWxUnionid;
  private int workStart;
  private int workEnd;
  private int childrenAccountId;
  private int userStatus;
  private int userFlag;
  private int userSex;
  private String userWeixinName;


}
