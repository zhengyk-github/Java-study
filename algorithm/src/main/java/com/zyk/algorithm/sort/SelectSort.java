package com.zyk.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: SelectSort
 * @Date: Created in 2023/4/12 11:09
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 选择排序
 **/
public class SelectSort {
	public static void main(String[] args) {
		int[] arr = new int[]{3, 5, 2, 4, 1, 10, 8, 7, 9, 6};
		SelectSortOpt(arr);
		System.out.println(Arrays.toString(arr));
	}

	//选择排序 核心思想：每一趟从未排序的区间找到一个最小元素，并放到未排序的第一位，直到全部区间有序为止
	public static void SelectSortOpt(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;//记录最小的值的下标
				}
			}
			if (i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}
