package algorithm算法.demo008_Comparable_Comparator.Comparable;

import java.util.Set;
import java.util.TreeSet;

public class test {

    public static void main(String[] args) {
        Set<Person1> set = new TreeSet<Person1>();
        set.add(new Person1("张三",30));
        set.add(new Person1("李四",15));
        set.add(new Person1("王五",20));
        System.out.println(set);
    }
}
