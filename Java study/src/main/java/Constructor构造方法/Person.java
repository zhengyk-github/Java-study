package Constructor构造方法;

/**
 * @ClassName: Person
 * @Date: Created in 2022/9/20 10:55
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("这是人类的吃饭方法");
    }
    public void sleep(){
        System.out.println("这是人类的睡觉方法");
    }


}
