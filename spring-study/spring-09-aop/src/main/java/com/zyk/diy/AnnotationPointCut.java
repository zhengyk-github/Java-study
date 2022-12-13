package com.zyk.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName: AnnotationPointCut
 * @Date: Created in 2022/12/13 14:40
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 方式三 使用注解方式实现AOP
 **/
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {

	@Before("execution(* com.zyk.service.UserServiceImpl.*(..))")
	public void before(){
		System.out.println("======方法执行前======");
	}
	@After("execution(* com.zyk.service.UserServiceImpl.*(..))")
	public void after(){
		System.out.println("======方法执行后======");
	}

	@Around("execution(* com.zyk.service.UserServiceImpl.*(..))")
	public void around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("环绕前");
		Signature signature = jp.getSignature();//获取签名
		System.out.println("signature:"+signature);

		Object proceed = jp.proceed();

		System.out.println("环绕后");
		System.out.println(proceed);
	}



}
