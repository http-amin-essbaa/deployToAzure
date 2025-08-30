package com.deployment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
