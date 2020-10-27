package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.service.ShoppingCartSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("scc")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartSerivce scService;

}
