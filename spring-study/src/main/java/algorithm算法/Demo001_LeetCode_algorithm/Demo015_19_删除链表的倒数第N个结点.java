package algorithm算法.Demo001_LeetCode_algorithm;

public class Demo015_19_删除链表的倒数第N个结点 {

	public static void main(String[] args) {

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode l1 = new ListNode(0,head);
		int num = 0;
		while (head != null) {
			num++;
			head = head.next;
		}
		ListNode l2 = l1;
		for (int i = 1; i <= num - n; i++) {
			l2 = l2.next;
		}
		l2.next = l2.next.next;
		ListNode ll = l1.next;
		return ll;
	}
}
