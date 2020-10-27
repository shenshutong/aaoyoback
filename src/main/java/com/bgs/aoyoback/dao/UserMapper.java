package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    AoyoUser userlogin(@Param("phone") String phone, @Param("password")String password);
}
