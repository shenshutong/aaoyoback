package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.SysGroup;
import com.bgs.aoyoback.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("shop")
public class ShopController {
    @Autowired
    private ShopService ss;

    @RequestMapping("getStoreList")
    @ResponseBody
    public List<SysGroup> getStoreList(){
        List<SysGroup> list=ss.getStoreList();
        return list;
    }
}
