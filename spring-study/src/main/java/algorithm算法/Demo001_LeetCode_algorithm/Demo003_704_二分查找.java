package algorithm算法.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo003_704_二分查找 {

	public static void main(String[] args) {
		int[] a = { -1, 0, 3, 5, 9, 12 };
		Scanner scanner = new Scanner(System.in);
		int target = scanner.nextInt();
		System.out.println(search(a, target));
	}

	public static int search(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				r = mid - 1;
			} else if (target > nums[mid]) {
				l = mid + 1;
			}
		}
		return -1;
	}

}
