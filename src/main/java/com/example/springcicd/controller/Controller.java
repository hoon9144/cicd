package com.example.springcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello() {
        return "안녕 이랄까나?????????????????/???????????";
    }
}
