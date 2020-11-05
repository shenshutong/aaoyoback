package com.bgs.aoyoback.mapper;

import com.bgs.aoyoback.pojo.AoyoCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
    List<AoyoCity> getCityList();

    List<AoyoCity> searchCityList(@Param("name") String name);

    List<AoyoCity> getCityListByPname(String pname);
}
