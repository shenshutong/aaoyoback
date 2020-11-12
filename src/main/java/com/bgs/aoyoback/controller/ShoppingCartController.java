package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoShoppingCart;
import com.bgs.aoyoback.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("scc")
public class ShoppingCartController {
    //购物车全查
    @Autowired
    private ScService scService;
    @RequestMapping("/queryShoppingCart")
    @ResponseBody
    public List<AoyoShoppingCart> queryShoppingCart(Integer id){
        List<AoyoShoppingCart> list=scService.queryShoppingCart(id);
        return list;
    }
    //点击商品查看详情
    @RequestMapping("queryCommodityById")
    @ResponseBody
    public AoyoCommodity queryCommodityById(Integer commodityId){
        AoyoCommodity aoYo=scService.queryCommodityById(commodityId);
        System.out.println(aoYo);
        return aoYo;
    }
    //单删
    @RequestMapping("deleteById")
    @ResponseBody
    public int deleteById(Integer carId){
        int a=scService.deleteById(carId);
        return a;
    }
    //全删
    @RequestMapping("deleteAll")
    @ResponseBody
    public int deleteAll(String cartIdList){
        System.out.println(cartIdList);
        int b=scService.deleteAll(cartIdList);
        return b;
    }
}
