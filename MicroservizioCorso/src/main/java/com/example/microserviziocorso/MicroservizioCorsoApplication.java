package com.example.microserviziocorso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservizioCorsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservizioCorsoApplication.class, args);
    }

}
