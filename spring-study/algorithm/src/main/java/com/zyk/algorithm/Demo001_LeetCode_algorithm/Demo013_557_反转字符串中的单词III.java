package com.zyk.algorithm.Demo001_LeetCode_algorithm;

public class Demo013_557_反转字符串中的单词III {

	public static void main(String[] args) {

		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		StringBuffer sb = new StringBuffer();
		int n = s.length();
		int i = 0;
		int start;
		while (i < n) {
			start = i;
			while (i < n && s.charAt(i) != ' ') {
				i++;
			}
			for (int j = start; j < i; j++) {
				sb.append(s.charAt(start + i - 1 - j));
			}
			while (i < n && s.charAt(i) == ' ') {
				i++;
				sb.append(' ');
			}
		}
		return sb.toString();
	}
}
