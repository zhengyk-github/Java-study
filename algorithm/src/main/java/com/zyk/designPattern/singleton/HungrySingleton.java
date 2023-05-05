package com.zyk.designPattern.singleton;

/**
 * @ClassName: HungrySingleton
 * @Date: Created in 2023/3/20 14:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://blog.csdn.net/qq_43575801/article/details/127709635 Java实现单例模式（懒汉式和饿汉式）
 **/
public class HungrySingleton {
	private static HungrySingleton hungrySingleton = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}

}
