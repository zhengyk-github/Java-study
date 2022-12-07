package com.zyk.thread线程.Demo006_RunnableUse;

/**
 * @ClassName: Demo02_RunnableMore
 * @Date: Created in 2022/8/2 16:32
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: main线程启动两个子线程
 **/
public class Demo02_RunnableMore {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

    }
}

class T1 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println("hello" + count);
            if (count == 10) break;
        }
    }
}

class T2 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println("hi" + count);
            if (count == 10) break;
        }
    }
}