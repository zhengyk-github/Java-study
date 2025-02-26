package com.Netty.NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName: NIOFileChannel02
 * @Date: Created in 2025/2/26 16:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class NIOFileChannel02 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:\\file01.txt");
		FileInputStream fileinputStream = new FileInputStream(file);
		//通过fileinputStream获取对应的FileChannel
		FileChannel fileChannel = fileinputStream.getChannel();
		//创建缓冲区
		ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
		//把通道里的数据读到buffer
		fileChannel.read(byteBuffer);
		//将byteBuffer的字节数据转化为String
		System.out.println(new String(byteBuffer.array()));

		fileinputStream.close();
	}
}
