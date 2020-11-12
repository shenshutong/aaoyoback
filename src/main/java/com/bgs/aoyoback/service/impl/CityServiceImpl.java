package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.service.CityService;
import com.bgs.aoyoback.dao.CityMapper;
import com.bgs.aoyoback.pojo.AoyoCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<AoyoCity> getCityList() {

        return cityMapper.getCityList();
    }

    @Override
    public List<AoyoCity> searchCityList(String name) {
        return cityMapper.searchCityList(name);
    }

    @Override
    public List<AoyoCity> getCityListByPname(String pname) {
        return cityMapper.getCityListByPname(pname);
    }
}
