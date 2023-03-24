package com.zyk.aop;

import org.springframework.stereotype.Component;

/**
 * @ClassName: calImpl
 * @Date: Created in 2023/3/24 22:43
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Component
public class CalImpl implements Cal {
	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int dul(int a, int b) {
		int result = a - b;
		return result;
	}

	@Override
	public int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	public int div(int a, int b) {
		int result = a / b;
		return result;
	}
}
