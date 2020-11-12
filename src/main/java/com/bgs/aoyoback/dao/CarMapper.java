package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.CarBrand;
import com.bgs.aoyoback.pojo.CarBrandHot;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface CarMapper {

    List<CarBrandHot> getHotCarList();

    List<CarBrand> getCarList();

    List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter);

    List<CarBrand> searchCarList(@Param("name") String name);


}
