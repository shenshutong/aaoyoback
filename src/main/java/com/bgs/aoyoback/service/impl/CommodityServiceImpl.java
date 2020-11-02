package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.CommodityMapper;
import com.bgs.aoyoback.pojo.AoyoCommoditySuit;
import com.bgs.aoyoback.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public List<AoyoCommoditySuit> querySuitDetail(Integer id,Integer typeId) {
        return commodityMapper.querySuitDetail(id,typeId);
    }
}
