package com.bgs.aoyoback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * accessToken的数据传输对象
 *accessToken的内部字段信息
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccessTokenDto implements Serializable{

    //用户id
    private Integer aoyoId;

    //用户名
    private String aoyoPhone;

    //时间戳
    private Long timestamp;

    //随机字符串
    private String randomStr;

    //过期时间
    private Long expire;

}
