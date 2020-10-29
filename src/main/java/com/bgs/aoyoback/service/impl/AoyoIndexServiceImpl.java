package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.AoyoIndexMapper;
import com.bgs.aoyoback.pojo.AoyoCommodityImg;
import com.bgs.aoyoback.pojo.AoyoPlatformImage;
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
}
