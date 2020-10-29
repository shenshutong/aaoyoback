package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.AoyoCommodityImg;
import com.bgs.aoyoback.pojo.AoyoPlatformImage;

import java.util.List;

public interface AoyoIndexService {
    List<AoyoCommodityImg> selectIndexImage();

    List<AoyoPlatformImage> selectIndexPlatformImage();
}
