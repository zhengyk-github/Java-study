package com.zyk.designPattern.singleton;

/**
 * @ClassName: lazySingleton
 * @Date: Created in 2023/3/20 13:44
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://blog.csdn.net/qq_43575801/article/details/127709635 Java实现单例模式（懒汉式和饿汉式）
 **/
public class LazySingleton {
	private static volatile LazySingleton lazySingleton;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (lazySingleton == null) {
			synchronized (LazySingleton.class) {
				if (lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}

}
