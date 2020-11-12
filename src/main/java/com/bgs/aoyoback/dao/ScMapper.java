package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoShoppingCart;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScMapper {
    List<AoyoShoppingCart> queryShoppingCart(int id);

    AoyoCommodity queryCommodityById(@Param("id") Integer commodity_id);

    int deleteById(Integer carId);

    int deleteAll(String cartIdList);
}
