package com.bgs.aoyoback.Service.impl;

import com.bgs.aoyoback.Service.FenService;
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
}
