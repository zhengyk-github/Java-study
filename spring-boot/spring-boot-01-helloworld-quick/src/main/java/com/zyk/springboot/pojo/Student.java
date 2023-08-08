package com.zyk.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Student
 * @Date: Created in 2023/7/19 9:38
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
// @Configuration
@ConfigurationProperties(prefix = "student")
public class Student {
	private int age;
	private String name;

}
