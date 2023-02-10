package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName: testComparator
 * @Date: Created in 2023/2/10 14:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class testComparator {
	public static void main(String[] args) {
		UserComparator user1 = new UserComparator("dingli", 25, true);
		UserComparator user2 = new UserComparator("huxiaojuan", 24, false);
		UserComparator user3 = new UserComparator("xxx", 24, false);
		ArrayList<UserComparator> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		Collections.sort(list, new UserComparator());
		System.out.println("类自身实现Comparator:" + list.toString());

		//现在我想要按照名字升序，显然类中实现的不能满足要求，于是可以在类外自己实现想要的比较器
		Collections.sort(list, new Comparator<UserComparator>() {
			@Override
			public int compare(UserComparator o1, UserComparator o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("匿名内部类方式:"+list.toString());

		//由于Comparator接口是一个函数式接口，因此根据jdk1.8新特性，我们可以采用Lambda表达式简化代码
		Collections.sort(list,(u1,u2)->{return u1.getName().compareTo(u2.getName());});
		System.out.println("Lambda表达式方式根据name："+list);

		Collections.sort(list,(u1,u2)->{return u1.getAge()-u2.getAge();});
		System.out.println("Lambda表达式方式根据age："+list);
	}
}
