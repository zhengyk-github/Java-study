package com.zyk.algorithm.leetcode;

import com.zyk.algorithm.util.ListNode;

/**
 * @ClassName: Demo206_反转链表
 * @Date: Created in 2023/3/13 14:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/reverse-linked-list/
 **/
public class Demo206_反转链表 {
	public static void main(String[] args) {
		ListNode node5 = new ListNode(5, null);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		ListNode listNode = reverseList(node1);
		System.out.println(listNode);
	}


	public static ListNode reverseList(ListNode head) {
		ListNode next, pre = null;
		ListNode cur = head;
		while (cur != null) {
			next = cur.next;	//把当前节点的下一个节点进行临时保存
			cur.next = pre;		//从指向下一个节点变为指向上一个节点
			pre = cur;			//临时保存当前节点的值，作为下一次循环时指向节点的上一个节点的值
			cur = next;			//链表向后移一个节点
		}
		return pre;
	}
}
