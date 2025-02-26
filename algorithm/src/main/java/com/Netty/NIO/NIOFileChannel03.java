package com.Netty.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName: NIOFileChannel03
 * @Date: Created in 2025/2/26 16:33
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class NIOFileChannel03 {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream("d:\\file1.txt");
		FileChannel fileChannel1 = fileInputStream.getChannel();

		FileOutputStream fileOutputStream = new FileOutputStream("d:\\file2.txt");
		FileChannel fileChannel2 = fileOutputStream.getChannel();

		ByteBuffer byteBuffer = ByteBuffer.allocate(512);
		while (true) {
			byteBuffer.clear();

			int read = fileChannel1.read(byteBuffer);
			System.out.println("read=" + read);
			if (read == -1) {
				break;
			}
			byteBuffer.flip();
			fileChannel2.write(byteBuffer);
		}
		fileChannel1.close();
		fileChannel2.close();
	}
}
