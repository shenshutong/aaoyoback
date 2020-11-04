package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AoyoIndexMapper {
    List<AoyoCommodityImg> selectIndexImage();

    List<AoyoPlatformImage> selectIndexPlatformImage();

    List<AoyoPanel> getCommodityPanel();

    List<AoyoCommodity> queryshoppList(@Param("commodityName") String commodityName, @Param("orderBy")String orderBy);
}
