package algorithm算法.Demo001_LeetCode_algorithm;

public class Demo017_206_反转链表 {

	public static void main(String[] args) {

	}

	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode t = cur.next;
			cur.next = pre;
			pre = cur;
			cur = t;
		}
		return pre;
	}
}
