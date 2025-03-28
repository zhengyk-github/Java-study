package com.Netty.NIO;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName: MappedByteBufferTest
 * @Date: Created in 2025/2/27 13:44
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: MappedByteBuffer 可让文件直接在内存（堆外内存）修改，操作系统不需要拷贝一次
 **/
public class MappedByteBufferTest {
	public static void main(String[] args) throws Exception{
		RandomAccessFile randomAccessFile = new RandomAccessFile("d:\\file03.txt","rw");
		FileChannel fileChannel = randomAccessFile.getChannel();

		MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 5);

		mappedByteBuffer.put(1,(byte) 'H');
		mappedByteBuffer.put(3,(byte) 'O');

		System.out.println("修改成功！！");
		randomAccessFile.close();

	}
}
