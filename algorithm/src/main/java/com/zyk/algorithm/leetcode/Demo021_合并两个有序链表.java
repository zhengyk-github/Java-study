package com.zyk.algorithm.leetcode;

import com.zyk.algorithm.util.ListNode;

import java.util.Arrays;

/**
 * @ClassName: Demo021_合并两个有序链表
 * @Date: Created in 2023/3/15 9:29
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/merge-two-sorted-lists/
 **/
public class Demo021_合并两个有序链表 {

	public static void main(String[] args) {
		ListNode node3 = new ListNode(4, null);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);

		ListNode node6 = new ListNode(4, null);
		ListNode node5 = new ListNode(3, node6);
		ListNode node4 = new ListNode(1, node5);
		ListNode listNode = mergeTwoLists(node1, node4);
		while(listNode.next!=null){
			System.out.print(listNode.val);
			System.out.print("->");
			listNode = listNode.next;
		}
		System.out.print(listNode.val);

	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode b = new ListNode(0);
		ListNode a = b;
		while (list1 != null && list2 != null) {
			if(list1.val<=list2.val){
				a.next = list1;
				list1 = list1.next;
			}else{
				a.next = list2;
				list2 = list2.next;
			}
			a = a.next;
		}
		if(list1==null){
			a.next = list2;
		}
		if(list2==null){
			a.next = list1;
		}
		return b.next;
	}
}
