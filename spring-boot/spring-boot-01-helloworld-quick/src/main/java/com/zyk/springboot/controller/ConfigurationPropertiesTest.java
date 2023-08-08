package com.zyk.springboot.controller;

import com.zyk.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigurationPropertiesTest
 * @Date: Created in 2023/7/19 9:55
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@RestController
public class ConfigurationPropertiesTest {

	@Autowired
	private Student student;

	@RequestMapping("/ConfigurationPropertiesTest")
	public String test(){
		return student.toString();
	} //访问 http://localhost:8081/ConfigurationPropertiesTest

}
