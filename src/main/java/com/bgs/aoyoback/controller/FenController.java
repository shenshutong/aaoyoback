package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.service.FenService;

import com.bgs.aoyoback.pojo.AoyoAppClass;
import com.bgs.aoyoback.pojo.AoyoCommodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("classify")
@Controller
public class FenController {
    @Autowired
    private FenService fenService;
    ////查询左侧商品类别
    @RequestMapping("getShopType")
    @ResponseBody
    public List<AoyoAppClass> getShopType(){
        List<AoyoAppClass> list=fenService.getShopType();
        System.out.println(list);
        return list;
    }

    ////查询分类详情
    @RequestMapping("shoppList")
    @ResponseBody
    public List<AoyoCommodity> shoppList(Integer appClassId){
        List<AoyoCommodity> list=fenService.shoppList(appClassId);
        System.out.println(list);
        return list;
    }

    //获取商品列表\顶部搜索框
    @RequestMapping("shoppListUrl")
    @ResponseBody
    public List<AoyoCommodity> shoppListUrl(AoyoCommodity commodity){
        List<AoyoCommodity> list = fenService.shoppListUrl(commodity);
        return list;
    }


    @ResponseBody
    @RequestMapping("searchHot")
    public List<AoyoAppClass> searchHot() {
        List<AoyoAppClass> list = fenService.searchHot() ;
        return list;
    }



    }
