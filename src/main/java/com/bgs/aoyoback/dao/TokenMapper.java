package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoAuthToken;
import org.apache.ibatis.annotations.Param;

public interface TokenMapper {
    //根据aoyouserId修改active
    void updateActiveByUserId(Integer aoyoId);

    //token存到数据库
    void initTokenInfo(@Param("authToken") AoyoAuthToken authToken);

    //数据库查询accesstoken
    AoyoAuthToken findAccessToken(String accessToken);

    //注销accesstoken
    void invalidateByAccessToken(String accessToken);
}
