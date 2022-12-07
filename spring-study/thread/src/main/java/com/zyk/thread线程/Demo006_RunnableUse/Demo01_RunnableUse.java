package com.zyk.thread线程.Demo006_RunnableUse;

/**
 * @ClassName: Demo01_RunnableUse
 * @Date: Created in 2022/7/29 16:59
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Demo01_RunnableUse {
    public static void main(String[] args) {
        /*Dog dog = new Dog();
        Thread thread = new Thread(dog);//创建Thread对象，把dog对象(实现Runnable)，放入Thread
        thread.start();*/
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println("小狗汪汪叫" + ",count:" + count + "线程名：" + Thread.currentThread().getName());
            if (count == 20) {
                break;
            }
        }
    }
}

class ThreadProxy implements Runnable {//线程代理类

    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定 (运行类型Tiger)
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//这个方法是真正实现多线程的方法
    }

    public void start0() {
        run();
    }

}

class Animal{}

class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫");
    }
}
