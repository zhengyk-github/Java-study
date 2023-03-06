package com.zyk.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: metaAnnotation
 * @Date: Created in 2023/2/22 10:33
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: P3 元注解
 **/
@MyAnnotation
public class metaAnnotation {
	@MyAnnotation
	public void testTarget() {

	}

}

//定义一个注解
//@Target 表示我们的注解可以用到那些地方 //type 类；method 方法；FIELD 字段
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//@Retention 表示我们的注解在什么时候有效 RUNTIME>CLASS>SOURCE  //RUNTIME运行时有效,CLASS编译后的类,SOURCE原码级别
@Retention(value = RetentionPolicy.RUNTIME)
//@Documented 表示是否将我们的注解生成在javadoc中
@Documented
//@Inherited 表示子类可以继承父类的注解
@Inherited
@interface MyAnnotation {

}