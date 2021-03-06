package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoCity;

import java.util.List;

public interface CityService {
    List<AoyoCity> getCityList();

    List<AoyoCity> searchCityList(String name);

    List<AoyoCity> getCityListByPname(String pname);
}
