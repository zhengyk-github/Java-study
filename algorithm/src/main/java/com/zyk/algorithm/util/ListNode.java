package com.zyk.algorithm.util;

/**
 * @ClassName: ListNode
 * @Date: Created in 2023/3/13 14:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: ListNode
 **/
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
