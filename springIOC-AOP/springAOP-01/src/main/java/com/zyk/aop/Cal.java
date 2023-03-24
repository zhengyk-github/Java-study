package com.zyk.aop;

import org.springframework.stereotype.Component;

/**
 * @ClassName: cal
 * @Date: Created in 2023/3/24 22:42
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/

public interface Cal {
	public int add(int a,int b);
	public int dul(int a,int b);
	public int mul(int a,int b);
	public int div(int a,int b);
}
