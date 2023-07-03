package com.zyk.enumTest;

/**
 * @ClassName: TestSize
 * @Date: Created in 2023/6/5 9:40
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestSize {

	//private static Size size;

	public static void main(String[] args) {
		onChosen(Size.valueOf("LARGE"));
	}
	static void onChosen(Size size){
		switch (size){
			case SMALL:
				System.out.println("chosen small");
				break;
			case MEDIUM:
				System.out.println("chosen medium");
				break;
			case LARGE:
				System.out.println("chosen large");
				break;
		}
	}
}
