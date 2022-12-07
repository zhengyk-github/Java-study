package com.zyk.pojo;

/**
 * @ClassName: Student
 * @Date: Created in 2022/12/7 22:56
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserT {
	private String name;

	public UserT() {
		System.out.println("UserT被创建");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show(){
		System.out.println("name="+name);
	}
}
