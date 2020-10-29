package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.ShopMapper;
import com.bgs.aoyoback.pojo.SysGroup;
import com.bgs.aoyoback.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper sm;

    @Override
    public List<SysGroup> getStoreList() {
        return sm.getStoreList();
    }
}
