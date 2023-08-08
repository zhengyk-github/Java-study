package com.zyk.random.randomRedPacket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * @ClassName: RandomRedPacket
 * @Date: Created in 2023/7/22 11:01
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RandomRedPacket {
	private int leftMoney;
	private int leftNum;
	private Random rnd;

	public RandomRedPacket(int total, int num) {
		this.leftMoney = total;
		this.leftNum = num;
		this.rnd = new Random();
	}

	public synchronized int nextMoney() {
		if (this.leftNum <= 0) {
			throw new IllegalStateException("抢光了");
		}
		if (this.leftNum == 1) {
			return this.leftMoney;
		}
		double max = this.leftMoney / this.leftNum * 2d;
		int money = (int) (rnd.nextDouble() * max);
		money = Math.max(1, money); //如果小于1 则值赋为1
		this.leftMoney -= money;
		this.leftNum--;
		return money;
	}

}
