package com.bgs.aoyoback.Service;

import com.bgs.aoyoback.pojo.AoyoAppClass;
import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoCommodityBrand;

import java.util.List;

public interface FenService {
    List<AoyoAppClass> getShopType();

    List<AoyoCommodity> shoppList(Integer appClassId);
}
