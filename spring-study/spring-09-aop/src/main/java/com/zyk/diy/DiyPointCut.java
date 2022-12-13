package com.zyk.diy;

/**
 * @ClassName: DiyPointCut
 * @Date: Created in 2022/12/13 14:15
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class DiyPointCut {

	public void before(){
		System.out.println("======方法执行前======");
	}
	public void after(){
		System.out.println("======方法执行后======");
	}
}
