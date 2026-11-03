package com.pharma.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {
    public static void main(String[] args) {
        system.out.println("Starting API Gateway Application...");
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
