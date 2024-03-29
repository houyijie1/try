package com.hand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.hand.mapper")
public class HandApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandApplication.class, args);
    }

}
