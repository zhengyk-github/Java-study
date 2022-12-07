package com.zyk.algorithm.Demo001_LeetCode_algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Demo006_3_无重复字符的最长子串 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {
		if(s.length()==0) return 0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int max = 0,left = 0;
		for(int i =0 ;i < s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				left = Math.max(left, map.get(s.charAt(i))+1);//如果出现重复的则往右边滑动
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i-left+1);
		}
		return max;
    }
}
