package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.AoyoIndexMapper;
import com.bgs.aoyoback.pojo.*;
import com.bgs.aoyoback.service.AoyoIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoyoIndexServiceImpl implements AoyoIndexService {
    @Autowired
    private AoyoIndexMapper aoyoIndexMapper;
    @Override
    public List<AoyoCommodityImg> selectIndexImage() {
        return aoyoIndexMapper.selectIndexImage();
    }

    @Override
    public List<AoyoPlatformImage> selectIndexPlatformImage() {
        return aoyoIndexMapper.selectIndexPlatformImage();
    }

    @Override
    public List<AoyoPanel> getCommodityPanel() {
        return aoyoIndexMapper.getCommodityPanel();
    }

    @Override
    public List<AoyoCommodity> queryshoppList(String commodityName, String orderBy) {
        return aoyoIndexMapper.queryshoppList(commodityName,orderBy);
    }
}
