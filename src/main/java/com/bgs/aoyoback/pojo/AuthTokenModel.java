package com.bgs.aoyoback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 认证token模型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthTokenModel {

    private String accessToken;//token

    private Long accessExpire;//过期时间
}
