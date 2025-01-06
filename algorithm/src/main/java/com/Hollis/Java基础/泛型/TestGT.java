package com.Hollis.Java基础.泛型;

/**
 * @ClassName: TestGT
 * @Date: Created in 2023/11/14 15:19
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 泛型类中的静态变量也只有一份，不会有多分
 **/
public class TestGT {
	public static void main(String[] args) {
		GT<Integer> gti = new GT<Integer>();
		GT<String> gts = new GT<String>();
		gti.var = 1;
		gts.var = 2;
		System.out.println(gti.var);
	}

}
class GT<T>{
	public static int var = 0;
}
