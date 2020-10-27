package com.bgs.aoyoback.service.imp;

import com.bgs.aoyoback.dao.TestMapper;
import com.bgs.aoyoback.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper tm;
}
