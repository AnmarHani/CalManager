package com.calmanager.auth.calmanager_auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
