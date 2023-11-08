package com.zyk.designPattern.template;

/**
 * @ClassName: PercentageCoupon
 * @Date: Created in 2023/11/8 14:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class PercentageCoupon extends Coupon {
	@Override
	protected void applyDiscount() {
		//具体的百分比折扣逻辑
		System.out.println("应用百分比折扣逻辑！");

	}

	@Override
	protected void displayConfirmation() {
		//具体的百分比优惠券确认展示逻辑
		System.out.println("百分比折扣优惠确认！");
	}
}
