package com.Hollis.并发.顺序执行线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: SingleThreadExecutor
 * @Date: Created in 2024/1/3 11:05
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 任务按照提交的顺序逐个执行
 **/
public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		MyThread task1 = new MyThread();
		executor.submit(task1);
	}
}
