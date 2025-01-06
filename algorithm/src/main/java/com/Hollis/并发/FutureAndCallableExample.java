package com.Hollis.并发;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: FutureAndCallableExample
 * @Date: Created in 2024/1/8 13:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class FutureAndCallableExample {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Callable<String > callable=()->{
			System.out.println("Entered Callable");
			Thread.sleep(2000);
			return "Hello From Callable";
		};

		FutureTask<String> futureTask = new FutureTask<>(callable);
		Thread thread = new Thread(futureTask);
		thread.start();

		System.out.println("Do something else while callable is getting executed");
		System.out.println("Retrieved:"+futureTask.get());
	}
}
