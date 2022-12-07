package com.zyk.thread线程.Demo002_TieldTest;

/**
 * @ClassName: Run
 * @Date: Created in 2022/7/28 16:34
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 执行MyThread线程
 **/
//demo地址 https://blog.csdn.net/K_520_W/article/details/89186556
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
