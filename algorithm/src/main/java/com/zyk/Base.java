package com.zyk;

/**
 * @ClassName: test
 * @Date: Created in 2023/4/11 10:18
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Base {
	public static String s = "static_base";
	public String m = "base";
	public static void staticTest(){
		System.out.println("base static:"+s);
	}
	public static void main(String[] args) {
		Child c = new Child();
		//向上转型 向上转型是指将子类的对象赋给父类变量的过程。在向上转型后，原来子类特有的部分被“隐藏”，只能访问父类中共有的部分。向上转型可以通过父类引用调用子类对象的共有方法
		Base b = c;
		System.out.println(b.s);
		System.out.println(b.m);
		b.staticTest();
		System.out.println(c.s);
		System.out.println(c.m);
		c.staticTest();
		//向下转型 向下转型是指将父类对象转为子类对象的过程。在向下转型时，必须用强制类型转换符进行强制转换。注意，进行向下转型之前，需要通过 instanceof 关键字进行类型判断，以避免发生类型转换异常。
		if(b instanceof Child){
			System.out.println("向下转型------");
			Child d = (Child) b;
			System.out.println(d.s);
			System.out.println(d.m);
			d.staticTest();
		}

	}

	/*public static void main(String[] args) {
		System.out.println(rest(0, 2));
		System.out.println(rest(0, 2, 3));
		System.out.println(rest(0, 2, 3, 4));
		System.out.println(rest(0, 2, 3, 4, 5));
		System.out.println(rest(0, 2, 3, 4, 5, 6));
	}
	private static int rest(int a1, int... a) {
		int max = a1;
		for (int j = 0; j < a.length; j++) {
			if (max < a[j]) {
				max = a[j];
			}
		}
		return max;
	}*/

}

class Child extends Base{
	public static String s = "static_child";
	public String m = "child";
	public static void staticTest(){
		System.out.println("base static:"+s);
	}
}