package com.codershere.disoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DisoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisoveryServiceApplication.class, args);
    }

}
