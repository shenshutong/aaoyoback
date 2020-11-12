package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoAppClass;
import com.bgs.aoyoback.pojo.AoyoCommodity;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface FenMapper {
    List<AoyoAppClass> getShopType();

    List<AoyoCommodity> shoppList(Integer appClassId);

    List<AoyoCommodity> shoppListUrl(AoyoCommodity commodity);

    List<AoyoAppClass> searchHot();
}
