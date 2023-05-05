package com.zyk.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: BubbleSort
 * @Date: Created in 2023/4/12 9:10
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 冒泡排序 https://mp.weixin.qq.com/s?__biz=MzAxMjY5NDU2Ng==&mid=2651862169&idx=1&sn=e011e79ff77736dfb389084bb3a20d37&chksm=804971d0b73ef8c649d7c9b08706f3c33b0e10c3935e24982337b05d69f1487ace072fbd48d9&scene=27
 **/
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[]{3, 5, 2, 4, 1, 10, 8, 7, 9, 6};
		BubbleSortOpt(arr);
		System.out.println(Arrays.toString(arr));
	}

	//冒泡排序 核心思想：1.从第一个元素开始,比较相邻的两个元素,如果第一个比第二个大,则进行交换
	// 				 2.每次排序得到一个最大值(双重循环下遍历一次j的循环得到一个最大值),对剩余的元素重复操作,直到没有任何一对元素需要比较为止
	public static void BubbleSortOpt(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
