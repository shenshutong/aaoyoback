package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCity;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface CityMapper {
    List<AoyoCity> getCityList();

    List<AoyoCity> searchCityList(@Param("name") String name);

    List<AoyoCity> getCityListByPname(String pname);
}
