package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.config.Result;
import com.bgs.aoyoback.pojo.AoyoCommoditySuit;
import com.bgs.aoyoback.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    /**
     * 查询保养套餐
     * @return
     */
    @GetMapping("/querySuitDetail")
    public Result querySuitDetail(Integer id,Integer typeId){
        List<AoyoCommoditySuit> aoyoCommoditySuit= commodityService.querySuitDetail(id,typeId);
        return new Result(true,200,"查询成功",aoyoCommoditySuit);
    }
}
