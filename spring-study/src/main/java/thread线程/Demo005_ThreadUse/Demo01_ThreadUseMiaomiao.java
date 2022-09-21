package thread线程.Demo005_ThreadUse;

/**
 * @ClassName: Demo01_ThreadUseMiaomiao
 * @Date: Created in 2022/7/29 13:10
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: ThreadUseMiaomiao
 **/
public class Demo01_ThreadUseMiaomiao {
    public static void main(String[] args) throws InterruptedException {
        cat cat = new cat();
        cat.start();//执行线程->最终会执行cat中的run方法
        //当main线程启动一个线程，主线程不会阻塞会继续执行 （主线程、子线程交替执行）
//        cat.run();//只是一个方法 没有真正的启动一个线程 需run方法执行完之后才会向下执行
        //主线程继续执行
        System.out.println("主线程继续执行:"+Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程i:"+i+", 主线程名："+Thread.currentThread().getName());
            Thread.sleep(1000);
        }


    }


}

//1.当一个类继承了Thread类，该类就可以当做线程使用
//2.重写run方法，写上自己的业务代码
//3.Thread中的run方法是实现了Runnable的run方法
class cat extends Thread {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("我是一只小喵喵"+(++count)+"执行时间"+System.currentTimeMillis()+"线程名:"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==80){
                break;
            }
        }
    }
}