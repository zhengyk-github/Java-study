package com.zyk;

import com.zyk.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @ClassName: MyTest
 * @Date: Created in 2022/12/7 17:49
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class MyTest {
	public static void main(String[] args) {
		//获取Spring的上下文内容
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//我们的对象现在都在Spring中管理了，我们要使用 直接去里面取出来就可以！
		Hello hello = (Hello) context.getBean("hello");
		System.out.println(hello.toString());

	}
}
