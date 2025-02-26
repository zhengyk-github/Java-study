package com.Netty.NIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName: NIOFileChannel01
 * @Date: Created in 2025/2/26 16:02
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class NIOFileChannel01 {
	public static void main(String[] args) throws Exception {
		String str = "练习NIOFileChannel-写文件";
		FileOutputStream outputStream = new FileOutputStream("d:\\file01.txt");

		FileChannel fileChannel = outputStream.getChannel();

		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		byteBuffer.put(str.getBytes());
		byteBuffer.flip();

		fileChannel.write(byteBuffer);

		outputStream.close();
	}
}
