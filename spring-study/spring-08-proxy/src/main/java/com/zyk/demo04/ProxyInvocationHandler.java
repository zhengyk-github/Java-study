package com.zyk.demo04;

import com.zyk.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyInvocationHandler
 * @Date: Created in 2022/12/12 17:36
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 我们会用这个类，自动生成代理类
 **/
public class ProxyInvocationHandler implements InvocationHandler {
	//被代理的接口
	private Object object;

	public void setObject(Object object) {
		this.object = object;
	}

	//生成得到代理类
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
	}

	//处理代理实例，并返回结果
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log(method.getName());
		//动态代理的本质，就是使用反射机制实现
		Object result = method.invoke(object, args);
		return result;
	}
	public void log(String msg){
		System.out.println("执行了"+msg+"方法");
	}
}
