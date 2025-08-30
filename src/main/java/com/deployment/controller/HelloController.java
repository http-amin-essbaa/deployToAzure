package com.deployment.controller;

@RestController
public class HelloController {
    @GetMapping("/amin")
    public String hello() {
        return "Hello World!";
    }
}
