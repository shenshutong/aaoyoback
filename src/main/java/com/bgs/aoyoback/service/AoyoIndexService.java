package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.*;

import java.util.List;

public interface AoyoIndexService {
    List<AoyoCommodityImg> selectIndexImage();

    List<AoyoPlatformImage> selectIndexPlatformImage();

    List<AoyoPanel> getCommodityPanel();

    List<AoyoCommodity> queryshoppList(String commodityName, String orderBy);
}
