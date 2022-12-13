package com.zyk.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName: log
 * @Date: Created in 2022/12/13 11:01
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class log implements MethodBeforeAdvice {
	//method:要执行的目标对象的方法
	//args:参数
	//target:目标对象
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
	}
}
