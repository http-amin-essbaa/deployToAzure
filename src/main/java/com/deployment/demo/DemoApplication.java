package com.deployment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello Badr, I have been working on deploying this application automatically on Microsoft Azure Cloud";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}