package com.Hollis.并发;

import java.util.concurrent.*;

/**
 * @ClassName: FutureAndCallableExample
 * @Date: Created in 2024/1/8 13:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class FutureAndCallableAndExecutorsExample {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable<String> callable = () -> {
			System.out.println("Entered Callable");
			Thread.sleep(2000);
			return "Hello From Callable";
		};
		System.out.println("Submitting Callable");
		Future<String> futureTask = executor.submit(callable);

		System.out.println("Do something else while callable is getting executed");
		System.out.println("Retrieved:" + futureTask.get());

		executor.shutdown();
	}
}
