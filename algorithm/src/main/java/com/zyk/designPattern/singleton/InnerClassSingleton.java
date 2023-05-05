package com.zyk.designPattern.singleton;

import java.io.Serializable;

/**
 * @ClassName: InnerClassSingleton
 * @Date: Created in 2023/3/20 14:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class InnerClassSingleton implements Serializable {

	private static class InnerClassHolder{
		private static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
	}


	private InnerClassSingleton() {
		if(InnerClassHolder.innerClassSingleton!=null){
			throw new RuntimeException("单例不允许多个实例");
		}
	}

	public static InnerClassSingleton getInstance(){
		return InnerClassHolder.innerClassSingleton;
	}

}
