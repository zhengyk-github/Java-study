package com.zyk.designPattern.template;

/**
 * @ClassName: FixedAmountCoupon
 * @Date: Created in 2023/11/8 14:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class FixedAmountCoupon extends Coupon {
	@Override
	protected void applyDiscount() {
		//具体的固定金额逻辑
		System.out.println("应用固定金额逻辑！");
	}

	@Override
	protected void displayConfirmation() {
		//具体的固定金额优惠券确认展示逻辑
		System.out.println("固定金额优惠确认！");
	}
}
