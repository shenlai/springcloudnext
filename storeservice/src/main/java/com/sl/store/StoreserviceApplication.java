package com.sl.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sl.store.dao")
@SpringBootApplication
public class StoreserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreserviceApplication.class, args);
    }
}
