package com.bgs.aoyoback.controller;

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
    @Autowired
    private ScService scService;
    @RequestMapping("/queryShoppingCart")
    @ResponseBody
    public List<AoyoShoppingCart> queryShoppingCart(int id){
        List<AoyoShoppingCart> list=scService.queryShoppingCart(id);
        return list;
    }
}
