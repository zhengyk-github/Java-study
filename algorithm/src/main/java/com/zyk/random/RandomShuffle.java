package com.zyk.random;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName: Shuffle 洗牌
 * @Date: Created in 2023/7/22 10:28
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 洗牌  将一个数组或序列随机重新排序
 **/
public class RandomShuffle {
	public static void main(String[] args) {
		int[] arr = new int[13];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		shuffle(arr);
		System.out.println("洗牌后的结果:" + Arrays.toString(arr));
	}

	public static void shuffle(int[] arr) {
		Random random = new Random();
		for (int i = arr.length; i > 1; i--) {
			swap(arr, i - 1, random.nextInt(i));
			System.out.println(i + ":" + Arrays.toString(arr));
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


}
