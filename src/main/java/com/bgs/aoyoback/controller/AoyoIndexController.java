package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.config.Result;
import com.bgs.aoyoback.pojo.AoyoCommodityImg;
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
        return new Result(false,-1,"successful",commodityImgs);
    }

}
