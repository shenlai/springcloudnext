package com.sl.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BlogserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogserviceApplication.class, args);
    }
}
