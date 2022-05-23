package com.practice.base.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(){
        return "Welcome to Spring Boot Tutorial";
    }

    @GetMapping(value = "/getC")
    public String namaste(){
        return "This is using Get Mapping....";

    }
}
