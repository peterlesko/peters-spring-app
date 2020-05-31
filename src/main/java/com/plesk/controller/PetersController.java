package com.plesk.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetersController {

    @PostMapping("/names/{name}")
    public String publish(String name) {
       return name;
    }
}
