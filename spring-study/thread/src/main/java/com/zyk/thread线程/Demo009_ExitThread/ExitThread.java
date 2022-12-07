package com.zyk.thread线程.Demo009_ExitThread;

/**
 * @ClassName: ExitThread
 * @Date: Created in 2022/8/3 13:59
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 通知线程退出
 **/
public class ExitThread {
    public static void main(String[] args) {
        aThread aThread = new aThread();
        new Thread(aThread).start();
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i:" + i + ",main线程运行中:" + Thread.currentThread().getName());

            if (i == 20) {
                aThread.changeFlag(false);
            }
        }

    }

}

class aThread implements Runnable {
    private Boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程运行中:" + Thread.currentThread().getName());
        }
    }

    public void changeFlag(Boolean flag) {
        this.flag = flag;
    }
}