package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.service.FenService;
import com.bgs.aoyoback.dao.FenMapper;
import com.bgs.aoyoback.pojo.AoyoAppClass;
import com.bgs.aoyoback.pojo.AoyoCommodity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FenServiceImpl implements FenService {
    @Resource
    private FenMapper fenMapper;

    @Override
    public List<AoyoAppClass> getShopType() {

        return fenMapper.getShopType();
    }

    @Override
    public List<AoyoCommodity> shoppList(Integer appClassId)
    {

        return fenMapper.shoppList(appClassId);
    }

    @Override
    public List<AoyoCommodity> shoppListUrl(AoyoCommodity commodity) {
        return fenMapper.shoppListUrl(commodity);
    }

    @Override
    public List<AoyoAppClass> searchHot() {
        return fenMapper.searchHot();
    }
}
