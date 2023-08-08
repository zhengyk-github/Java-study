package com.zyk.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

/**
 * @ClassName: Test_Arrays_Sort
 * @Date: Created in 2023/7/3 10:59
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: Arrays类的sort、toString、binarySearch、copyOf、fill、hashCode、parallelPrefix、setAll
 **/
public class Test_Arrays_Sort {
	public static void main(String[] args) {
		String[] arr = {"hello", "world", "Break", "abc"};
		int[] ints2 = {1, 56, 100, 233, 443, 3, 5, 10, 34, 2};
		Arrays.sort(ints2, 0, 6);
		System.out.println("区间排序：" + Arrays.toString(ints2));
		array_Sort(arr);
		array_Sort_Order(arr);
		System.out.println("二分查找：" + Arrays.binarySearch(arr, "world"));
		array_Sort_Comparator_Order_Asc(arr);
		array_Sort_Comparator_Order_Desc(arr);

		System.out.println("使用copy------");
		String[] arr1 = Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(arr1));
		Arrays.fill(arr1, "测试");
		System.out.println("使用fill设置元素:" + Arrays.toString(arr1));
		Arrays.fill(arr1, 2, 4, "测试范围设置");
		System.out.println("使用fill范围设置元素:" + Arrays.toString(arr1));
		System.out.println("Arrays.hashCode(arr):" + Arrays.hashCode(arr) + ",,,Arrays.hashCode(arr1):" + Arrays.hashCode(arr1));

		int[] ints1 = {1, 56, 100, 233, 443, 3, 5, 10, 34, 2};
		Arrays.parallelPrefix(ints1, new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				return left + right;
			}
		});//数组从左到右前后位置相加并赋值给数组，固定区间可以使用parallelPrefix(int[] array, int fromIndex, int toIndex, IntBinaryOperator op)
		System.out.println("数组从左到右前后位置相加并赋值给数组:" + Arrays.toString(ints1));

		int[] ints3 = {1, 56, 100, 233, 443, 3, 5, 10, 34, 2};
		Arrays.setAll(ints3, new IntUnaryOperator() {
			@Override
			public int applyAsInt(int operand) {
				return ints3[operand] - operand;
			}
		});//Arrays.parallelSetAll()方法与Arrays.setAll()功能一样，只是该方法增加了并行能力，可以利用多CPU并行来提高性能
		System.out.println("按指定算法替换:"+Arrays.toString(ints3));
	}


	//排序 从小到大 区分大小写 --大写字母的ASCII码比小写字母的小
	public static void array_Sort(String[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[Break, abc, hello, world]
	}

	//排序 从小到大 不区分大小写
	public static void array_Sort_Order(String[] arr) {
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(arr));//[abc, Break, hello, world]
	}

	//排序 从大到小 区分大小写
	public static void array_Sort_Comparator_Order_Asc(String[] arr) {
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(arr));//[world, hello, abc, Break]
	}

	//排序 从大到小 不区分大小写
	public static void array_Sort_Comparator_Order_Desc(String[] arr) {
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareToIgnoreCase(o1);
			}
		});
		System.out.println(Arrays.toString(arr));//[world, hello, Break, abc]
	}
}
