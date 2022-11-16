package com.demo.modules.web02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloWeb02Controller
 * @Date: Created in 2022/11/11 10:18
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@RestController
public class HelloWeb02Controller {
    @RequestMapping(path = "/helloweb02")
    public String helloWeb02(){
        System.out.println("进入到helloWeb02()");
        return "helloWeb02";
    }
}
