package com.wanshifu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoTestController {

    @RequestMapping("/test")
    public String helloWorld(){
        return "Hello my name is yangqiang";
    }

    @RequestMapping("/test/pengyu")
    public String testHelloWorld(){
        return "Hello my name is pengyu";
    }



}
