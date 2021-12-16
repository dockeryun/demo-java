package com.wanshifu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo2")
public class HelloController {

    @RequestMapping("/test")
    public String helloWorld(){
        return "go go go!!!";
    }

}
