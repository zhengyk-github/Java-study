package thread线程.Demo002_TieldTest;

/**
 * @ClassName: MyThread
 * @Date: Created in 2022/7/28 16:37
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 继承Thread实现线程
 **/
//demo地址 https://blog.csdn.net/K_520_W/article/details/89186556
public class MyThread extends Thread{
    @Override
    public void run() {
        long starttime = System.currentTimeMillis();
        int count = 0;
        for(int i=0;i<600000;i++){
            Thread.yield();
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间："+(endTime-starttime)+"毫秒");
        System.out.printf("count:"+count);
    }
}
