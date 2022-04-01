package com.xmu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xmu.mapper")
public class XmuOrderingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmuOrderingSystemApplication.class, args);
    }

}
