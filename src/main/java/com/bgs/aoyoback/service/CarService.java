package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.CarBrand;
import com.bgs.aoyoback.pojo.CarBrandHot;


import java.util.List;

public interface CarService {
    List<CarBrandHot> getHotCarList();

    List<CarBrand> getCarList();

    List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter);

    List<CarBrand> searchCarList(String name);


}
