package com.wanshifu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @author huangming@wshifu.com
 * @return
 * @date 2019/8/22  14:32
 */
@RestController
@RequestMapping("hello")
public class HelloWorld {

    @RequestMapping("hello")
    public String helloWorld(){
        return "Hello world!!!";
    }


}
