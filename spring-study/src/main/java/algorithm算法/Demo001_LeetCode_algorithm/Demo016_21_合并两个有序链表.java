package algorithm算法.Demo001_LeetCode_algorithm;

public class Demo016_21_合并两个有序链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		} else if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
	}

	// 两种方法
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		ListNode re = new ListNode(0);
		ListNode p = re;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				p.next = l1;
				l1 = l1.next;
			} else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		p.next = (l1 == null ? l2 : l1);
		return re.next;
	}
}
