package com.theankit.Ankitk8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello - Jhooq-k8s";
    }
}
