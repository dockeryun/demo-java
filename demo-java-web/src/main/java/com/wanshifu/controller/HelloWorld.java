package com.wanshifu.controller;

import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("hello")
    public String helloWorld(){
        return "Hello world!!!123";
    }

    /**
     * @author liyuanixiang
     */
    @PostMapping("hello")
    public String helloWorldLiyuanxiang(){
        return "Hello world!!!liyuanxiang";
    }



    //测试代码review3333444

}
