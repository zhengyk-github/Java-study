package com.zyk.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: QuickSort
 * @Date: Created in 2023/4/12 16:37
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 快速排序
 **/
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[]{3, 5, 2, 4, 1, 10, 8, 7, 9, 6};
		QuickSortOpt(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	//快速排序 核心思想:把待排序的数组拆分成左右两个区间，左边的都比基准数小，右边的都比基准数大，然后对左右分别进行同样的操作
	public static void QuickSortOpt(int[] arr, int left, int right) {
		if (left < right) {
			int temp = arr[left];//基准数
			int start = left;
			int end = right;
			while (start < end) {
				//从最右边开始找比基准数小的数
				while (start < end && arr[end] >= temp) {
					end--;
				}
				arr[start] = arr[end];
				//从最左边开始找比基准数大的数
				while (start < end && arr[start] <= temp) {
					start++;
				}
				arr[end] = arr[start];
			}
			arr[start] = temp;//下标重合了,start和end一样
			QuickSortOpt(arr, left, start);
			QuickSortOpt(arr, start + 1, right);
		}
	}
}
