package com.zyk.thread线程.Demo004_Singleton_Volatile;

/**
 * @ClassName: VolatileTest
 * @Date: Created in 2022/7/29 10:51
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description:  https://zhuanlan.zhihu.com/p/425772213
 **/
public class VolatileTest {
    public static void main(String[] args) {
        VolatileTestObj obj = new VolatileTestObj();
        new Thread(() -> {
            while (true) {
                obj.put("time：" + System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        new Thread(() -> {
            while (true) {
                System.out.println(obj.get());
                System.out.println(Thread.currentThread().getName());

            }
        }).start();
    }
}
