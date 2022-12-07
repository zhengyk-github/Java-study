package com.zyk.pojo;

/**
 * @ClassName: Hello
 * @Date: Created in 2022/12/7 16:11
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Hello {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Hello{" +
			"str='" + str + '\'' +
			'}';
	}
}
