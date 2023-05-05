package com.zyk.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: Synchronized_Lock
 * @Date: Created in 2023/3/31 9:43
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By: 并发编程的锁机制：synchronized和lock
 * @Description: https://blog.csdn.net/dc2222333/article/details/89845651?spm=1001.2014.3001.5502
 **/
public class Synchronized_Lock {
	private static int count;

	public static void main(String[] args) throws InterruptedException {
		int maxThread = 10;
		int maxValue = 1000000;
		testAsync(maxThread, maxValue);
		testLock(maxThread, maxValue);
	}

	private static void testLock(int maxThread, int maxValue) throws InterruptedException {
		Thread[] t = new Thread[maxThread];
		long begin = System.nanoTime();
		for (int i = 0; i < maxThread; i++) {
			count = 0;
			ReentrantLock lock = new ReentrantLock();
			t[i] = new Thread(() -> {
				for (int j = 0; j < maxValue; j++) {
					try {
						lock.lock();
					} finally {
						lock.unlock();
					}
					count++;
				}
			});
		}
		for (int i = 0; i < maxThread; i++) {
			t[i].start();
		}
		for (int i = 0; i < maxThread; i++) {
			t[i].join();
		}
		System.out.println("lock执行所花费的时间：" + (System.nanoTime() - begin));
	}

	private static void testAsync(int maxThread, int maxValue) throws InterruptedException {
		Thread[] t = new Thread[maxThread];
		int[] lock = new int[0];
		long begin = System.nanoTime();
		for (int i = 0; i < maxThread; i++) {
			count = 0;
			t[i] = new Thread(() -> {
				for (int j = 0; j < maxValue; j++) {
					synchronized (lock) {
						count++;
					}
				}
			});
		}
		for (int i = 0; i < maxThread; i++) {
			t[i].start();
		}
		for (int i = 0; i < maxThread; i++) {
			t[i].join();
		}
		System.out.println("synchronized执行所花费的时间：" + (System.nanoTime() - begin));
	}

}
