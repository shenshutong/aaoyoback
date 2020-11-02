package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.SysGroup;

import java.util.List;

public interface ShopService {
    List<SysGroup> getStoreList();

    SysGroup queryGroupDetail(Integer groupId);

    List<AoyoCommodity> queryCommodityApi(Integer groupId);
}
