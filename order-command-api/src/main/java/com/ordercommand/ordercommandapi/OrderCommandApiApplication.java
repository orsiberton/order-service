package com.ordercommand.ordercommandapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderCommandApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderCommandApiApplication.class, args);
    }
}
