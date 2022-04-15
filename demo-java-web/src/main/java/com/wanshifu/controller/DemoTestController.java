package com.wanshifu.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoTestController {

    @RequestMapping("/test")
    public String helloWorld(){
        return "maliangliang test";
    }

    @PostMapping("/testWuweili")
    public String testWuweili() {
        return "wuweili test";
    }


}
