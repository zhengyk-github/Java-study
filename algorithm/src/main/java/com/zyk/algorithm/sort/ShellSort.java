package com.zyk.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: ShellSort
 * @Date: Created in 2023/4/17 10:19
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 希尔排序
 **/
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = new int[]{3, 5, 2, 4, 1, 10, 8, 7, 9, 6};
		//shellSortOpt(arr);
		shellSortOpt2(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void shellSortOpt(int[] arr) {
		//遍历所有的步长
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			//遍历所有的元素
			for (int i = gap; i < arr.length; i++) {
				//遍历本组中所有的元素
				for (int j = i - gap; j >= 0; j -= gap) {
					//如果当前元素大于加上步长后的那个元素则交换位置
					if (arr[j] > arr[j + gap]) {
						int temp = arr[j];
						arr[j] = arr[j + gap];
						arr[j + gap] = temp;
					}
				}
			}
		}
	}

	public static void shellSortOpt2(int[] arr) {
		//遍历所有的步长
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			//对每一组都进行插入排序
			for (int i = 0; i < gap; i++) {
				//对本组的数据进行插入排序
				for (int j = i + gap; j < arr.length; j += gap) {
					if (arr[j] < arr[j - gap]) {
						int k;
						int temp = arr[j];
						for (k = j - gap; k >= 0 && arr[k] > temp; k -= gap) {
							arr[k + gap] = arr[k];
						}
						arr[k + gap] = temp;
					}
				}
			}
		}
	}
}
