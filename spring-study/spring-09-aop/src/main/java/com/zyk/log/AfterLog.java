package com.zyk.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName: AfterLog
 * @Date: Created in 2022/12/13 10:59
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class AfterLog implements AfterReturningAdvice {
	//returnValue:返回值
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("执行了"+method.getName()+"方法，返回结果为："+returnValue);
	}
}
