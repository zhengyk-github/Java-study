package com.zyk.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: insertSort
 * @Date: Created in 2023/4/17 9:27
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 插入排序
 **/
public class insertSort {
	public static void main(String[] args) {
		int[] arr = new int[]{3, 5, 2, 4, 1, 10, 8, 7, 9, 6};
		insertSortOpt(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertSortOpt(int[] arr) {
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i - 1] > arr[i]) {
				int j;
				int temp = arr[i];
				for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
					arr[j + 1] = arr[j];
				}
				arr[j + 1] = temp;
			}
		}
	}

}
