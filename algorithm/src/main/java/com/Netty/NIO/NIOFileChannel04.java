package com.Netty.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @ClassName: NIOFileChannel04
 * @Date: Created in 2025/2/26 16:45
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 拷贝文件transferFrom方法
 **/
public class NIOFileChannel04 {
	public static void main(String[] args) throws Exception{
		FileInputStream fileInputStream = new FileInputStream("d:\\图片1.jpg");
		FileChannel infileChannel = fileInputStream.getChannel();

		FileOutputStream fileOutputStream = new FileOutputStream("d:\\图片2.jpg");
		FileChannel outfileChannel = fileOutputStream.getChannel();

		//outfileChannel.transferFrom(infileChannel,0,infileChannel.size());
		infileChannel.transferTo(0,infileChannel.size(),outfileChannel);

		infileChannel.close();
		outfileChannel.close();
		fileInputStream.close();
		fileOutputStream.close();
	}
}
