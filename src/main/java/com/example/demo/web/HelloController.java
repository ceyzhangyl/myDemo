package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/he")
    public String sayHello(){
        System.out.println("做一点修改");
        return "hello zhang";
    }
}
