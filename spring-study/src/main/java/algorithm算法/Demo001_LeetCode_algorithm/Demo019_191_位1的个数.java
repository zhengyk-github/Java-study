package algorithm算法.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo019_191_位1的个数 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(hammingWeight(scanner.nextInt()));
	}

	public static int hammingWeight(int n) {
		int sum = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) != 0) {
				sum++;
			}
		}
		return sum;
	}
}
