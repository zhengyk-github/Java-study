package com.zyk.designPattern.singleton;

/**
 * @ClassName: EnumSingleton
 * @Date: Created in 2023/3/20 15:15
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://www.bilibili.com/video/BV16P411P7iW/?spm_id_from=333.1007.top_right_bar_window_history.content.click&vd_source=2098b2d038738a1989d69e4e4c2f2621
 **/
public enum EnumSingleton {
	INSTANCE;

	public void print() {
		System.out.println(this.hashCode());
	}

}

class enumTest {
	public static void main(String[] args) {
		EnumSingleton instance = EnumSingleton.INSTANCE;
		EnumSingleton instance1 = EnumSingleton.INSTANCE;
		System.out.println(instance == instance1);
	}
}
