package com.zyk.genericity;

/**
 * @ClassName: GenericityTest
 * @Date: Created in 2023/7/22 14:53
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class GenericityTest {

	public static void main(String[] args) {
		Pair pair = makePair(1, 2);
		System.out.println(pair.getFirst()+","+pair.getSecond());
	}

	public static <U, V> Pair<U, V> makePair(U first, V second) {
		Pair<U, V> uvPair = new Pair<>(first, second);
		return uvPair;
	}
}

class Pair<U, V> {
	Object first;
	Object second;

	public Pair(Object first, Object second) {
		this.first = first;
		this.second = second;
	}

	public Pair() {
	}

	public Object getFirst() {
		return first;
	}

	public void setFirst(Object first) {
		this.first = first;
	}

	public Object getSecond() {
		return second;
	}

	public void setSecond(Object second) {
		this.second = second;
	}
}
