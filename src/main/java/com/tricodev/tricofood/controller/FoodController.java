package com.tricodev.tricofood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

