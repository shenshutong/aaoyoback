package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.SysGroup;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopMapper {
    List<SysGroup> getStoreList();
}
