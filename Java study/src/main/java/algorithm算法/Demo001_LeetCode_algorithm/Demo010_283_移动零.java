package algorithm算法.Demo001_LeetCode_algorithm;

public class Demo010_283_移动零 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		int[] a = { 0 };
		moveZeroes(a);
	}

	public static void moveZeroes(int[] nums) {
		int j = 0, n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}
		for (int i = j; i < n; i++) {
			nums[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
}
