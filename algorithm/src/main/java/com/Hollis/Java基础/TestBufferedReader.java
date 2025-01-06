package com.Hollis.Java基础;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: TestBufferedReader
 * @Date: Created in 2023/11/14 14:23
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Zyk-Java-Study\\test.txt"));
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		//try-with-resource的用法
		/*try (BufferedReader br = new BufferedReader(new FileReader("D:\\Zyk-Java-Study\\test.txt"))) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	}
}
