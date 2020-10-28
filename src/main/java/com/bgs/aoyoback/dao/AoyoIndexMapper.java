package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCommodityImg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AoyoIndexMapper {
    List<AoyoCommodityImg> selectIndexImage();
}
