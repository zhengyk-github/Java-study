package algorithm算法.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo002_9_回文数 {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			System.out.println(isPalindrome(a));
		}
	}
	//基础的回文数解法
	/*public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if (x == 0)
			return true;
		int a = x, b = 0;
		while (a > 0) {
			b = b * 10 + a % 10;
			a /= 10;
		}
		System.out.println("b="+b+",x="+x);
		if (b == x)
			return true;
		return false;
	}*/
	//进阶的回文数解法
	public static boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0))
			return false;
		int re = 0;
		while (x > re) {
			re = re * 10 + x % 10;
			x /= 10;
		}
		return x == re || x == re / 10;
	}
}
