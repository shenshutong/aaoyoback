package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoShoppingCart;

import java.util.List;

public interface ScService {
    List<AoyoShoppingCart> queryShoppingCart(int id);
}
