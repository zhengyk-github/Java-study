package com.zyk;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName: Test_Arrays_Sort
 * @Date: Created in 2023/7/3 10:59
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Test_Arrays_Sort {
	public static void main(String[] args) {
		String[] arr = {"hllo","wrld","Break","abc"};
		array_Sort(arr);
		array_Sort_Order(arr);
		array_Sort_Comparator_Order_Asc(arr);
		array_Sort_Comparator_Order_Desc(arr);
	}
	//排序 从小到大 区分大小写 --大写字母的ASCII码比小写字母的小
	public static void array_Sort(String[] arr){
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[Break, abc, hllo, wrld]
	}
	//排序 从小到大 不区分大小写
	public static void array_Sort_Order(String[] arr){
		Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(arr));//[abc, Break, hllo, wrld]
	}
	//排序 从大到小 区分大小写
	public static void array_Sort_Comparator_Order_Asc(String[] arr){
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(arr));//[wrld, hllo, abc, Break]
	}
	//排序 从大到小 不区分大小写
	public static void array_Sort_Comparator_Order_Desc(String[] arr){
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareToIgnoreCase(o1);
			}
		});
		System.out.println(Arrays.toString(arr));//[wrld, hllo, Break, abc]
	}
}
