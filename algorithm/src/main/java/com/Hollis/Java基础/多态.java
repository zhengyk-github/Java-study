package com.Hollis.Java基础;

/**
 * @ClassName: 多态
 * @Date: Created in 2023/11/9 14:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 多态的概念比较简单，就是同一个操作作用于不同的对象，可以有不同的解释，产生不同的执行结果。
 * 如果按照这个概念来定义的话，那么多态应该是一种运行期的状态。为了实现运行期的多态，或者说是动态绑定，需满足三个条件：
 * · 有类继承或者接口实现
 * · 子类要重写父类的方法
 * · 父类的引用指向子类的对象
 **/
public class 多态 {
	public static void main(String[] args) {
		Parent ps = new Son(); //3.父类的引用指向子类的对象
		ps.call();

		Parent pd = new Daughter(); //3.父类的引用指向子类的对象
		pd.call();

	}
}

class Parent {
	public void call() {
		System.out.println("in Parent");
	}
}

class Son extends Parent { //1.有类继承或者接口实现
	public void call() { //2.子类要重写父类的方法
		System.out.println("in Son");
	}
}

class Daughter extends Parent {
	public void call() {
		System.out.println("in Daughter");
	}
}