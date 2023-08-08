package com.zyk.random.randomRedPacket;

/**
 * @ClassName: RandomRedPacketTest
 * @Date: Created in 2023/7/22 11:09
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 抢红包算法
 **/
public class RandomRedPacketTest {
	public static void main(String[] args) {
		RandomRedPacket randomRedPacket = new RandomRedPacket(1000, 10);
		int count = randomRedPacket.getLeftNum();
		for (int i = 0; i < count; i++) {
			System.out.print(randomRedPacket.nextMoney()+" ");
		}
	}
}
