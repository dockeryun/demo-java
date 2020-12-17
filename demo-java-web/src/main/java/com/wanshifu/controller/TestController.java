package com.wanshifu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @author zhucj@wshifu.com
 * @return
 * @date 2020/12/17  09:32
 */
@RestController
@RequestMapping("test")
public class TestController {

    @PostMapping("demo01")
    public String helloWorld(){
        return "Hello my name is zhuchuanjie";
    }
}
