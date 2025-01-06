package com.Hollis.并发.顺序执行线程;

/**
 * @ClassName: MyThread
 * @Date: Created in 2024/1/3 11:21
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class MyThread extends Thread{
	@Override
	public void run() {
		//执行任务的代码
		System.out.println("执行了MyThread的run()方法");
	}
}
