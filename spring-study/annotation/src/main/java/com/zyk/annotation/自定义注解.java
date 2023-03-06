package com.zyk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: 自定义注解
 * @Date: Created in 2023/2/22 16:49
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: P4 自定义注解
 **/
public class 自定义注解 {
	@MyAnnotation2(age = 18)
	public void testMyAnnotation2() {
	}

	@MyAnnotation3("测试")
	public void testMyAnnotation3() {
	}

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
	//注解的参数：参数类型+参数名();
	//可以通过default来声明参数的默认值
	String name() default "zyk";

	int age();

	int id() default -1;//如果默认值为-1,代表不存在

	String[] schools() default {"郑永凯", "测试"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
	String value();//如果只有一个参数成员,一般参数名为value
}