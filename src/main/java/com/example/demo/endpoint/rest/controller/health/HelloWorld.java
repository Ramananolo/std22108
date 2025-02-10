package com.example.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public Map<String, String> helloWorld(){
        return Map.of("message", "Hello world!");
    }
}