package algorithm算法.demo008_Comparable_Comparator.Comparable;

public class Person1 implements Comparable<Person1> {
    private Integer age;
    private String name;

    public Person1(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Person1 o) {//重写方法 先比较年龄再比较名字
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
