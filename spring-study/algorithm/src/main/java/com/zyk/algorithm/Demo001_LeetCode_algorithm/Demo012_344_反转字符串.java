package com.zyk.algorithm.Demo001_LeetCode_algorithm;

public class Demo012_344_反转字符串 {

	public static void main(String[] args) {
		char []a = {'h','e','l','o'};
		reverseString(a);
	}
	public static void reverseString(char[] s) {
		int j =s.length-1;
		int n =s.length;
		int mid = n%2==1?n/2:n/2-1;
		System.out.println("mid:"+mid);
		char st;
		for(int i = 0;i<=mid ;i++) {
			st = s[i];
			s[i] = s[j];
			s[j] = st;
			j--;
		}
		
		for(int i = 0;i <n;i++) {
			System.out.println(s[i]);
		}
    }
}
