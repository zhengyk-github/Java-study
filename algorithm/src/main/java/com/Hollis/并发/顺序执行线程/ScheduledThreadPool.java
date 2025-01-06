package com.Hollis.并发.顺序执行线程;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ScheduledThreadPool
 * @Date: Created in 2024/1/3 11:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 任务会按照依赖关系和前一个任务的执行时间逐个执行
 **/
public class ScheduledThreadPool {
	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		MyThread task1 = new MyThread();
		MyThread task2 = new MyThread();
		MyThread task3 = new MyThread();
		ScheduledFuture<?> future1 = executor.schedule(task1, 0, TimeUnit.MILLISECONDS);
		/*ScheduledFuture<?> future2 = executor.schedule(task2, future1.get(), TimeUnit.MILLISECONDS);
		ScheduledFuture<?> future3 = executor.schedule(task3, future2.get(), TimeUnit.MILLISECONDS);*/
		executor.shutdown();
	}
}
