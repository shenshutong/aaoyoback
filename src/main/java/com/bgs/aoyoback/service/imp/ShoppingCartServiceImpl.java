package com.bgs.aoyoback.service.imp;

import com.bgs.aoyoback.dao.ShoppingCartDao;
import com.bgs.aoyoback.service.ShoppingCartSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartSerivce {
    @Autowired
    private ShoppingCartDao scd;


}
