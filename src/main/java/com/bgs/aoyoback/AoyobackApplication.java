package com.bgs.aoyoback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bgs.aoyoback.dao")
public class AoyobackApplication {

    public static void main(String[] args) {
        SpringApplication.run(AoyobackApplication.class, args);
    }

}
