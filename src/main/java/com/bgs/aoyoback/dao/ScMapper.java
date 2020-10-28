package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScMapper {
    List<AoyoShoppingCart> queryShoppingCart(int id);
}
