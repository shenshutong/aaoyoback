package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.config.Result;
import com.bgs.aoyoback.pojo.AoyoCommodityImg;
import com.bgs.aoyoback.pojo.AoyoPlatformImage;
import com.bgs.aoyoback.service.AoyoIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/AoyoIndex")
public class AoyoIndexController {
    @Autowired
    private AoyoIndexService aoyoIndexService;
    @GetMapping("/getIndexImage")
    public Result getIndexImage(){
        List<AoyoCommodityImg> commodityImgs =  aoyoIndexService.selectIndexImage();
        if (commodityImgs==null){
            return new Result(false,-1,"error");
        }
        return new Result(true,0,"successful",commodityImgs);
    }@GetMapping("/getIndexPlatformImage")
    public Result getIndexPlatformImage(){
        List<AoyoPlatformImage> aoyoPlatformImages =  aoyoIndexService.selectIndexPlatformImage();
        if (aoyoPlatformImages==null){
            return new Result(false,-1,"error");
        }
        return new Result(true,0,"successful",aoyoPlatformImages);
    }
}
