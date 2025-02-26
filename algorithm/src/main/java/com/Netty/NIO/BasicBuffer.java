package com.Netty.NIO;

import java.nio.IntBuffer;

/**
 * @ClassName: BasicBuffer
 * @Date: Created in 2025/2/26 13:59
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: NIO
 **/
public class BasicBuffer {

	public static void main(String[] args) {
		//创建一个buffer，大小为5
		IntBuffer intBuffer = IntBuffer.allocate(5);
		for (int i = 0; i < intBuffer.capacity(); i++) {
			intBuffer.put(i * 2);
		}
		//将buffer转换，读写切换！！！(不可缺少)
		intBuffer.flip();
		while (intBuffer.hasRemaining()) {
			System.out.println(intBuffer.get());
		}


	}


}
