package Comparable_Comparator;

import java.util.Comparator;

/**
 * @ClassName: UserComparator
 * @Date: Created in 2023/2/10 14:38
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 实现Comparator
 **/
public class UserComparator implements Comparator<UserComparator> {
	private String name;
	private int age;
	private boolean sex;

	public UserComparator() {
	}

	public UserComparator(String name, int age, boolean sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UserComparator{" +
			"name='" + name + '\'' +
			", age=" + age +
			", sex=" + sex +
			'}';
	}

	@Override
	public int compare(UserComparator o1, UserComparator o2) {
		return o1.age - o2.age;
	}
}
