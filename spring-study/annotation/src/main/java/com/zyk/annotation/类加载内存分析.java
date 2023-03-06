package com.zyk.annotation;

/**
 * @ClassName: 类加载内存分析
 * @Date: Created in 2023/2/25 15:24
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: P9 类加载内存分析
 * *类的加载与ClassLoader的理解     https://www.bilibili.com/video/BV1p4411P7V3/?p=9&spm_id_from=pageDriver&vd_source=2098b2d038738a1989d69e4e4c2f2621
 * ·加载：将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，然后生成一个代表这个类的java.lang.Class对象。
 * ·链接：将Java类的二进制代码合并到JVM的运行状态之中的过程。
 * ·验证：确保加载的类信息符合JVM规范，没有安全方面的问题。
 * ·准备：正式为类变量(static)分配内存并设置类变量默认初始值的阶段，这些内存都将在方法区中进行分配。
 * ·解析：虚拟机常量池内的符号引用(常量名)替换为直接引用(地址)的过程。
 * ·初始化：
 * ·执行类构造器<clinit>()方法的过程。类构造器<clinit>()方法是由编译期自动收集类中所有类变量的赋值动作和静态代码块中的语句合并产生的。(类构造器是构造类信息的,不是构造该类对象的构造器)
 * ·当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化。
 * ·虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确加锁和同步。
 **/
public class 类加载内存分析 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(A.m);
		/*
		1.加载到内存,会产生一个类对应的class对象
		2.链接,链接结束后m=0
		3.初始化
			<clinit>(){
				System.out.println("A类静态代码块初始化");
				m = 300;
				m = 100;
			}
			m = 100;
		 */
	}
}

class A {
	static {
		System.out.println("A类静态代码块初始化");
		m = 300;
	}

	static int m = 100;

	public A() {
		System.out.println("A类的无参构造初始化");
	}
}
