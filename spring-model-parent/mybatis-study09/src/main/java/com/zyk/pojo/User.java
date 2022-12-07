package com.zyk.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Date: Created in 2022/12/6 14:40
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Data
public class User implements Serializable {
	private int id;
	private String name;
	private String pwd;

	public User(int id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	public User() {
	}
}
