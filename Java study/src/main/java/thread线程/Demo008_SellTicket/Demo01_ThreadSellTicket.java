package thread线程.Demo008_SellTicket;

/**
 * @ClassName: Demo01_ThreadSellTicket
 * @Date: Created in 2022/8/2 17:02
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 多线程售票问题
 **/
public class Demo01_ThreadSellTicket {
    public static void main(String[] args) {
        Ticket1 ticket01 = new Ticket1();
        Ticket1 ticket02 = new Ticket1();
        Ticket1 ticket03 = new Ticket1();
        ticket01.start();
        ticket02.start();
        ticket03.start();
//        Ticket2 ticket2 = new Ticket2();
//        new Thread(ticket2).start();
//        new Thread(ticket2).start();
//        new Thread(ticket2).start();


    }
}

class Ticket1 extends Thread {
    private static int sum = 100;

    @Override
    public void run() {
        while (true) {
            if (sum <= 0) {
                System.out.println("票已售完");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "正在售票中，剩余票数：" + (--sum));
        }
    }
}


class Ticket2 implements Runnable {
    private int sum = 10;

    @Override
    public void run() {
        while (true) {
            if (sum <= 0) {
                System.out.println("票已售完");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "正在售票中，剩余票数：" + (--sum));
        }
    }
}
