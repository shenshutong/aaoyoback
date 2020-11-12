package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.service.CarService;
import com.bgs.aoyoback.dao.CarMapper;
import com.bgs.aoyoback.pojo.CarBrand;
import com.bgs.aoyoback.pojo.CarBrandHot;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Resource
    private CarMapper carMapper;

    @Override
    public List<CarBrandHot> getHotCarList() {

        return carMapper.getHotCarList();
    }

    @Override
    public List<CarBrand> getCarList() {

        return carMapper.getCarList();
    }

    @Override
    public List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter) {
        return carMapper.getCarListByLetter(carBrandPyFirstLetter);
    }

    @Override
    public List<CarBrand> searchCarList(String name) {

        return carMapper.searchCarList(name);
    }


}
