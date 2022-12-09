package com.zyk.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName: user
 * @Date: Created in 2022/12/9 14:52
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Component
@Scope("singleton")
//单例singleton  原型prototype
public class User {
	/*public String name = "zyk测试@Component";*/

	@Value("zyk测试@Value")
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
