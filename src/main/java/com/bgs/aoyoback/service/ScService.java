package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoShoppingCart;

import java.util.List;

public interface ScService {
    //全查购物车
    List<AoyoShoppingCart> queryShoppingCart(int id);
    //通过id查商品
    AoyoCommodity queryCommodityById(Integer commodity_id);
    //通过id删除商品
    int deleteById(Integer carId);
    //全部删除
    int deleteAll(String cartIdList);
}
