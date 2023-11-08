package com.zyk.queue.priorityQueue;

/**
 * @ClassName: Task
 * @Date: Created in 2023/9/18 10:20
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Task {
	int priority;
	String name;

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Task(int priority, String name) {
		this.priority = priority;
		this.name = name;
	}

	public Task() {
	}
}
