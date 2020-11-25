package com.wanshifu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param null
 * @author huangming@wshifu.com
 * @return
 * @date 2019/8/22  14:32
 */
@RestController
@RequestMapping("hello")
public class HelloWorld {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello world!!!!4546";
    }


}
