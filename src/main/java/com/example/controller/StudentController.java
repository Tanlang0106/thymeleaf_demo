package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @ResponseBody
    @RequestMapping
    public String test(){
        return "你好";
    }
    @ResponseBody
    @RequestMapping
    public String test1(){
        System.out.println("...2");
        System.out.println("...2");
        System.out.println("...3");
        return "你好!";
    }
}
