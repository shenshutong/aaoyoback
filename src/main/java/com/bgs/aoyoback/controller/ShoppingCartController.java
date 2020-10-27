package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.AoyoShoppingCart;
import com.bgs.aoyoback.service.ShoppingCartSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("scc")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartSerivce scService;
  /*  @RequestMapping("queryAll")
    @ResponseBody
    public List<AoyoShoppingCart> queryAll(int id){
        List<AoyoShoppingCart> list=scService.queryAll(id);
        return list;
    }*/
}
