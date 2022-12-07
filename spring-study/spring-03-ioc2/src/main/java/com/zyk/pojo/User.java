package com.zyk.pojo;

/**
 * @ClassName: User
 * @Date: Created in 2022/12/7 22:26
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class User {
	private String name;

	public User() {
		System.out.println("User的无参构造");
	}

	public User(String name) {
		this.name = name;
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
