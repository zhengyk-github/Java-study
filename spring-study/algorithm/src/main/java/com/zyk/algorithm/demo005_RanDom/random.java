package com.zyk.algorithm.demo005_RanDom;

import java.util.Random;

public class random {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());

        Random random1 = new Random(10);
        System.out.println(random1.nextInt());


        Random random3 = new Random();
        System.out.println(random3.nextFloat());

        Random random4 = new Random();
        System.out.println(random4.nextDouble());

        Random random5 = new Random();
        System.out.println(random5.nextBoolean());

    }
}
