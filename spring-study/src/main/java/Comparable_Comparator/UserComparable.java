package Comparable_Comparator;

/**
 * @ClassName: UserC
 * @Date: Created in 2023/2/10 14:21
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 实现Comparable
 **/
public class UserComparable implements Comparable<UserComparable> { //该类实现Comparable接口，参数为UserC

	private String name;
	private int age;
	private boolean sex;

	public UserComparable() {
	}

	public UserComparable(String name, int age, boolean sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" +
			"name='" + name + '\'' +
			", age=" + age +
			", sex=" + sex +
			'}';
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

	/**
	 * 重写compareTo方法，实现年龄升序,年龄相同则姓名升序
	 **/
	@Override
	public int compareTo(UserComparable user) {
		if (this.age == user.age) return this.name.compareTo(user.name);
		return this.age - user.age; //将this想像成一排不变的对象(已经按照要求排好序的)，而User就是当前要插入的对象，只有user属性小于this属性才插入从而升序，个人理解，希望有所帮助
	}

}
