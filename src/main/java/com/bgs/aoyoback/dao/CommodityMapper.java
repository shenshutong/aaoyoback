package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCommoditySuit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityMapper {

    List<AoyoCommoditySuit> querySuitDetail(@Param("id")Integer id,@Param("typeId")Integer typeId);
}
