package thread线程.Demo010_ThreadMethod;

/**
 * @ClassName: Demo01_interruptThread
 * @Date: Created in 2022/8/3 14:40
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: interrupt 会中断休眠
 **/
public class Demo01_interruptThread {
    public static void main(String[] args) throws InterruptedException {
        interruptThread interruptThread = new interruptThread();
        interruptThread.setPriority(Thread.MIN_PRIORITY);
        System.out.println("interruptThread线程的优先级:" + interruptThread.getPriority());
        interruptThread.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("main线程正在执行中，i:" + i);
        }
        System.out.println("main线程正在执行"+Thread.currentThread().getName()+",,interruptThread线程的getName:"+interruptThread.getName());
        interruptThread.interrupt();
    }
}

class interruptThread extends Thread {

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 20; i++) {
                System.out.println("i:" + i + "线程执行中:" + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println("线程被终止了");
                //e.printStackTrace();
            }
        }
    }
}