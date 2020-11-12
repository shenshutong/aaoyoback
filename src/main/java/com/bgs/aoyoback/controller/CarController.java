package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.CarBrand;
import com.bgs.aoyoback.pojo.CarBrandHot;
import com.bgs.aoyoback.response.BaseResponse;

import com.bgs.aoyoback.response.StatusCode;
import com.bgs.aoyoback.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;

@RequestMapping("carBrand")
@Controller
public class CarController {
    @Autowired
    private CarService carService;
    //获取热门车辆列表
    @RequestMapping("getHotCarList")
    @ResponseBody
    public BaseResponse getHotCarList(){
        List<CarBrandHot> list=carService.getHotCarList();
        if(list!=null){
            return new BaseResponse(StatusCode.Success,list);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }
    //获取车辆列表
    @RequestMapping("getCarList")
    @ResponseBody
    public BaseResponse getCarList(){
        List<CarBrand> list=carService.getCarList();
        HashMap<String,Object> map=new HashMap<String,Object>();
        if(list!=null){
            for (CarBrand carBrand : list) {
                map.put(carBrand.getCarBrandPyFirstLetter(),
                        carService.getCarListByLetter(carBrand.getCarBrandPyFirstLetter()));
            }
            return new BaseResponse(StatusCode.Success,map);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }
//    搜索车品牌
    @RequestMapping("searchCarList")
    @ResponseBody
    public BaseResponse searchCarList(String name){
        List<CarBrand> list=carService.searchCarList(name);
        System.out.println(list);
        if(list!=null){
            return new BaseResponse(StatusCode.Success,list);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败");
        }
    }


}
