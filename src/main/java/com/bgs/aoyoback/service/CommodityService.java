package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoCommoditySuit;

import java.util.List;

public interface CommodityService {

    List<AoyoCommoditySuit> querySuitDetail(Integer id,Integer typeId);
}
