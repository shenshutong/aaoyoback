package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.ScMapper;
import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoShoppingCart;
import com.bgs.aoyoback.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScServiceImpl implements ScService {
    @Autowired
    private ScMapper scMapper;

    @Override
    public List<AoyoShoppingCart> queryShoppingCart(int id) {
        List<AoyoShoppingCart> list = scMapper.queryShoppingCart(id);
        return list;
    }

    @Override
    public AoyoCommodity queryCommodityById(Integer commodity_id) {
        AoyoCommodity aoyo = scMapper.queryCommodityById(commodity_id);
        return aoyo;
    }

    @Override
    public int deleteById(Integer carId) {
        return scMapper.deleteById(carId);
    }

    @Override
    public int deleteAll(String cartIdList) {
        return scMapper.deleteAll(cartIdList);
    }
}
