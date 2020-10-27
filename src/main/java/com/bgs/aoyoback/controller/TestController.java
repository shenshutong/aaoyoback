package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Autowired
    private TestService ts;
}
