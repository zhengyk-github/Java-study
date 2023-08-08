package com.zyk.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ValueTest
 * @Date: Created in 2023/7/19 9:41
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@RestController
public class ValueTest {
	@Value("${student.name}")
	private String name;

	@RequestMapping("/valueTest")
	public String test(){
		return name;
	}

}
