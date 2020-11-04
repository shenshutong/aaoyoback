package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoCommodityImg;
import com.bgs.aoyoback.pojo.AoyoPanel;
import com.bgs.aoyoback.pojo.AoyoPlatformImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AoyoIndexMapper {
    List<AoyoCommodityImg> selectIndexImage();

    List<AoyoPlatformImage> selectIndexPlatformImage();

    List<AoyoPanel> getCommodityPanel();
}
