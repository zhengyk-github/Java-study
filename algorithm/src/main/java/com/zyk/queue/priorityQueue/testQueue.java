package com.zyk.queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName: testQueue
 * @Date: Created in 2023/9/18 10:21
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description:
 *
 * boolean add(E e);//在尾部添加元素，队列满时抛异常
 * boolean offer(E e);//在尾部添加元素，队列满时返回false
 * E remove();//删除头部元素，队列空时抛异常
 * E poll();//删除头部元素，队列空时返回null
 * E element();//查看头部元素，队列空时抛异常
 * E peek();//查看头部元素，队列空时返回null
 **/
public class testQueue {
	public static void main(String[] args) {
		Comparator<Task> taskComparator = new Comparator<Task>() {
			@Override
			public int compare(Task o1, Task o2) {	//逆序
				if (o1.priority > o2.priority) {
					return -1;
				} else if (o1.priority < o2.priority) {
					return 1;
				}
				return 0;
			}
		};

		Queue<Task> tasks = new PriorityQueue<Task>(11, taskComparator);
		tasks.offer(new Task(10, "看电视"));
		tasks.offer(new Task(20, "玩手机"));
		tasks.offer(new Task(100, "玩游戏"));

		Task task = tasks.poll();
		while (task != null) {
			System.out.println("name:" + task.getName() + ", priority:" + task.getPriority());
			task = tasks.poll();
		}
	}


}
