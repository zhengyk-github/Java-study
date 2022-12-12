package com.zyk.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: User
 * @Date: Created in 2022/12/9 16:53
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Component
public class User {
	private String name;


	public String getName() {
		return name;
	}
	@Value("zyk测试Config")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
			"name='" + name + '\'' +
			'}';
	}
}
