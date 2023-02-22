import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: test
 * @Date: Created in 2023/1/10 14:26
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class test {

	/*public static void main(String[] args) {
		Integer x = new Integer(1);
		Integer y = new Integer(1);
		System.out.println(x.equals(y)); // true
		System.out.println(x == y);      // false
		long lon = new Double(3.14).longValue();
		System.out.println(3*0.1);

		System.out.println("开始");
		System.exit(0);
		System.out.println("结束");
	}*/
	/*public static void main(String[] args) {
		Person p = new Person();
		p.setName("我是马化腾");
		p.setAge(1);
		PersonCrossTest(p);
		System.out.println("方法执行后的name：" + p.getName());
	}

	public static void PersonCrossTest(Person person) {
		System.out.println("传入的person的name：" + person.getName());
		person=new Person();
		System.out.println("person.getName():"+person.getName());
		person.setName("我是张小龙");
		System.out.println("方法内重新赋值后的name：" + person.getName());
	}*/

	public static void main(String[] args) {
		/*List<String>[] list11 = new ArrayList<String>[10]; //编译错误，非法创建
		List<String>[] list12 = new ArrayList<?>[10]; //编译错误，需要强转类型
		List<String>[] list13 = (List<String>[]) new ArrayList<?>[10]; //OK，但是会有警告
		List<?>[] list14 = new ArrayList<String>[10]; //编译错误，非法创建
		List<?>[] list15 = new ArrayList<?>[10]; //OK
		List<String>[] list6 = new ArrayList[10]; //OK，但是会有警告*/

		/*List<String> list = new ArrayList<>();
		list.add("12");
		list.add("13");
		list.add("14");
		System.out.println(list.get(2));*/

		/*ArrayList<String> list1 = new ArrayList();
		list1.add("1"); //编译通过
		//list1.add(1); //编译错误
		String str1 = list1.get(0); //返回类型就是String
		System.out.println("str1:"+str1);

		ArrayList list2 = new ArrayList<Integer>();
		list2.add("1"); //编译通过
		list2.add(1); //编译通过
		Object object = list2.get(0); //返回类型就是Object
		System.out.println("object:"+object);

		new ArrayList<String>().add("11"); //编译通过*/
		//new ArrayList<String>().add(22); //编译错误
		//String str2 = new ArrayList<String>().get(0); //返回类型就是String

		/*DateInter dateInter = new DateInter();
		dateInter.setValue(new Object()); //编译错误
		dateInter.setValue(new Date());*/

		/*List<String>[] lsa = new List<String>[10]; // Not really allowed.
		Object o = lsa;
		Object[] oa = (Object[]) o;
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(3));
		oa[1] = li; // Unsound, but passes run time store check
		String s = lsa[1].get(0); // Run-time error ClassCastException.*/




	}

}
class Person  {
	private String name;
	private int age;

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
}
class Pair<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
class DateInter extends Pair<Date> {

	@Override
	public void setValue(Date value) {
		super.setValue(value);
	}

	@Override
	public Date getValue() {
		return super.getValue();
	}
}
class ArrayWithTypeToken<T> {
	private T[] array;

	public ArrayWithTypeToken(Class<T> type, int size) {
		array = (T[]) Array.newInstance(type, size);
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

	public T[] create() {
		return array;
	}
}

