package com.zyk.io;

import java.io.*;

/**
 * @ClassName: WriterAndReader
 * @Date: Created in 2023/3/20 16:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class WriterAndReader {
	public static void main(String[] args) throws IOException {

		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("InnerClassSingletonTest1.txt"), "UTF-8");
		outputStreamWriter.write("郑永凯测试InnerClassSingletonTest");
		outputStreamWriter.close();

		InputStreamReader isr = new InputStreamReader(new FileInputStream("InnerClassSingletonTest1.txt"));

		char[] cbuf = new char[20];
		int len;
		while((len = isr.read(cbuf)) != -1){
			String str = new String(cbuf,0,len);
			System.out.print(str);
		}
		isr.close();
	}
}
