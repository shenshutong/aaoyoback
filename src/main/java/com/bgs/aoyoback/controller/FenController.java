package com.bgs.aoyoback.Controller;

import com.bgs.aoyoback.Service.FenService;

import com.bgs.aoyoback.pojo.AoyoAppClass;
import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoCommodityBrand;
import com.bgs.aoyoback.response.BaseResponse;
import com.bgs.aoyoback.utils.StatusCode;
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
}
