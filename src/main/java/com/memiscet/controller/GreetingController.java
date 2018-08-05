package com.memiscet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String greeting(){
        return "<h1>Hello from the other side!</h1>";
    }
}
