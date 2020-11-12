package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoAppClass;
import com.bgs.aoyoback.pojo.AoyoCommodity;


import java.util.List;

public interface FenService {
    List<AoyoAppClass> getShopType();

    List<AoyoCommodity> shoppList(Integer appClassId);

    List<AoyoCommodity> shoppListUrl(AoyoCommodity commodity);

    List<AoyoAppClass> searchHot();
}
