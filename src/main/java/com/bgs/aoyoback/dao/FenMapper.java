package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoAppClass;
import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoCommodityBrand;

import java.util.List;

public interface FenMapper {
    List<AoyoAppClass> getShopType();

    List<AoyoCommodity> shoppList(Integer appClassId);
}
