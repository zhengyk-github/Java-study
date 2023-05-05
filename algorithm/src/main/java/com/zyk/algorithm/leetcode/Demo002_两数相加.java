package com.zyk.algorithm.leetcode;

import com.zyk.algorithm.util.ListNode;

/**
 * @ClassName: Demo002_两数相加
 * @Date: Created in 2023/3/13 16:05
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/add-two-numbers/description/
 **/
public class Demo002_两数相加 {

	public static void main(String[] args) {
		ListNode node3 = new ListNode(3, null);
		ListNode node2 = new ListNode(4, node3);
		ListNode node1 = new ListNode(2, node2);

		ListNode node6 = new ListNode(4, null);
		ListNode node5 = new ListNode(6, node6);
		ListNode node4 = new ListNode(5, node5);
		ListNode listNode = addTwoNumbers(node1, node4);
		while(listNode!=null){
			System.out.println(listNode.val);
			listNode = listNode.next;
		}


	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode b = new ListNode(0);
		ListNode p = l1, q = l2, a = b;
		int s = 0, s1 = 0;
		while (p != null || q != null) {
			int p1 = (p != null) ? p.val : 0;
			int q1 = (q != null) ? q.val : 0;
			s = p1 + q1 + s1;
			s1 = s / 10;
			a.next = new ListNode(s % 10);
			a = a.next;
			if (p != null) {
				p = p.next;
			}
			if (q != null) {
				q = q.next;
			}
		}
		if (s1 > 0) {
			a.next = new ListNode(s1);
		}
		return b.next;
	}
}
