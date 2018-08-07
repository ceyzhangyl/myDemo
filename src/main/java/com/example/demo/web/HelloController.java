package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/he")
    public String sayHello(){
        System.out.println("做一点修改");
        System.out.println("再修改一次");
        System.out.println("修改4");
        return "hello zhang";
    }
}
