package com.zyk.designPattern.template;

/**
 * @ClassName: TestCoupon
 * @Date: Created in 2023/11/8 14:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestCoupon {
	public static void main(String[] args) {
		Coupon cp = new PercentageCoupon();
		cp.applyCoupon();

		System.out.println("------");

		Coupon cf = new FixedAmountCoupon();
		cf.applyCoupon();
	}
}
