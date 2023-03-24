package com.zyk.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName: LoggerAspect
 * @Date: Created in 2023/3/24 22:45
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Aspect
@Component
public class LoggerAspect {

	@Before("execution(* com.zyk.aop.*.*(..))")
	public void before(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"开始执行，入参是:"+ Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(value = "execution(* com.zyk.aop.*.*(..))",returning = "result")
	public void AfterReturning(JoinPoint joinPoint,Object result){
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"执行中，结果是:"+result);
	}

	@After("execution(* com.zyk.aop.*.*(..))")
	public void after(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"方法执行结束了！");
	}

}
