package com.zyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Date: Created in 2023/7/5 21:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World";
	}



}
