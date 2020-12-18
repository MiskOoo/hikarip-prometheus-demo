package com.ovopark.hikaricpprometheusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ovopark.hikaricpprometheusdemo.mapper")
public class HikaricpPrometheusDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HikaricpPrometheusDemoApplication.class, args);
    }

}
