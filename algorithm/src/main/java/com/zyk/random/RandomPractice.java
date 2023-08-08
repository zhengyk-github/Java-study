package com.zyk.random;

import java.util.Random;

/**
 * @ClassName: RandomPractice
 * @Date: Created in 2023/7/14 14:36
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class RandomPractice {
	/*
	 * Math.random() //生成一个0-1的随机数,类型为double,包括0但不包括1
	 * (new Random()).nextInt(10) //生成一个0-10的随机数，包括0但不包括10
	 * (new Random(20230714)).nextInt(10) //种子决定了随机产生的序列，种子相同，产生的随机数序列就是相同的
	 * */
	public static void main(String[] args) {
/*		for (int i = 0; i < 3; i++) {
			System.out.println(Math.random());//生成一个0-1的随机数,类型为double,包括0但不包括1
		}*/

		/*
		Random rnd = new Random();
		for (int i = 0; i < 2; i++) {
			System.out.println(rnd.nextInt(10));//rnd.nextInt(10) //生成一个0-10的随机数，包括0但不包括10
		}
		System.out.println((new Random()).nextInt(10));
		*/
		/*Random rnd2 = new Random(20230714);//种子决定了随机产生的序列，种子相同，产生的随机数序列就是相同的
		for (int i = 0; i < 3; i++) {
			System.out.println(rnd2.nextInt(100));
		}
		System.out.println("(new Random(20230714)).nextInt(10):"+(new Random(20230714)).nextInt(100));
		*/
	}
}
