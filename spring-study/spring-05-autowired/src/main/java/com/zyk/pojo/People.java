package com.zyk.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: People
 * @Date: Created in 2022/12/8 21:27
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class People {
	@Autowired
	private Cat cat;
	@Autowired
	private Dog dog;
	private String name;

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People{" +
			"cat=" + cat +
			", dog=" + dog +
			", name='" + name + '\'' +
			'}';
	}
}
