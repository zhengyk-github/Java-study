package com.zyk.annotation;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.springframework.core.env.SystemEnvironmentPropertySource;

/**
 * @ClassName: createClass
 * @Date: Created in 2023/2/24 13:24
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: P7 测试class类的创建方式有哪些
 **/
public class createClass {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Student();
		System.out.println("这个人是："+person.getName());

		//方式一:通过对象getClass()获得
		Class c1 = person.getClass();
		System.out.println(c1.hashCode());
		//方式二:Class.forName获得
		Class c2 = Class.forName("com.zyk.annotation.Student");
		System.out.println(c2.hashCode());
		//方式三:通过类名.class获得
		Class c3 = Student.class;
		System.out.println(c3.hashCode());
		//方式四:基本内置类型的包装类都有一个type属性
		Class c4 = Integer.TYPE;
		System.out.println(c4);
		//获得父类的类型
		Class c5 = c1.getSuperclass();
		System.out.println(c5);

	}
}

class Person{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Student extends Person{
	public Student(){
		this.name = "学生";
	}
}
class Teacher extends Person{
	public Teacher(){
		this.name = "老师";
	}
}