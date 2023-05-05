package com.zyk.designPattern.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: TestSingleton
 * @Date: Created in 2023/3/20 14:29
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class InnerClassSingletonTest {
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
		/*InnerClassSingleton instance = InnerClassSingleton.getInstance();
		InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
		System.out.println(instance==instance1);*/

		/*new Thread(()->{
			InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
			System.out.println(instance2);
		}).start();
		new Thread(()->{
			InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
			System.out.println(instance2);
		}).start();*/
		//通过反射 实例化
		/*Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		InnerClassSingleton instance3 = declaredConstructor.newInstance();
		InnerClassSingleton instance4 = InnerClassSingleton.getInstance();
		System.out.println(instance3==instance4);*/

		InnerClassSingleton instance5 = InnerClassSingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("InnerClassSingletonTest.txt"));
		oos.writeObject(instance5);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("InnerClassSingletonTest.txt"));
		InnerClassSingleton instance6 = (InnerClassSingleton) ois.readObject();
		System.out.println(instance5==instance6);

		/*OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("InnerClassSingletonTest1.txt"), "UTF-8");
		outputStreamWriter.write("郑永凯测试InnerClassSingletonTest");
		outputStreamWriter.close();

		InputStreamReader isr = new InputStreamReader(new FileInputStream("InnerClassSingletonTest1.txt"));

		char[] cbuf = new char[20];
		int len;
		while((len = isr.read(cbuf)) != -1){
			String str = new String(cbuf,0,len);
			System.out.println(str);
		}
		isr.close();*/


	}
}
