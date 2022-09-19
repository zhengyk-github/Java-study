package algorithm算法.Demo001_LeetCode_algorithm;

public class Demo014_876_链表的中间结点 {

	public static void main(String[] args) {

	}

	public ListNode middleNode(ListNode head) {
		ListNode[] a = new ListNode[100];
		int n = 0; 
		while(head!=null) {
			a[n++] = head;
			head = head.next;
		}
		return a[n/2];
    }
	
}
