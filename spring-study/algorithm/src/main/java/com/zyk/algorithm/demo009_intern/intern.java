package com.zyk.algorithm.demo009_intern;

public class intern {
    public static void main(String[] args) {
        String s2 = new String(new char[]{'j', 'a', 'v', 'a'});
        System.out.println(s2 == s2.intern());
        //test1();
        //test2();
    }

    public static void test1() {
        String s1 = new String(new char[]{'j', 'a', 'v', 'a'});
        s1.intern();
        String s2 = "java";
        System.out.println("test1:" + s1 == s2);
    }

    public static void test2() {
        String s1 = new String(new char[]{'j', 'a', 'v', 'a'});
        String s2 = "java";
        System.out.println("test2:" + s1.intern() == s2);
    }
}
