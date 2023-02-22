package typeConversion;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName: ByteToString
 * @Date: Created in 2023/2/10 9:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: byteToString
 **/
public class byteToString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "测试ab12";
		byte[] bt = str.getBytes("utf-8");
		System.out.println("bt.length:" + bt.length);//10
		for (int i = 0; i < bt.length; i++) {
			System.out.println(i + ":" + bt[i]);
		}
		System.out.println("byteToString:" + byteToString(bt));
		System.out.println("utfToString:" + utfToString(bt));
	}

	public static String byteToString(byte[] bytes) throws UnsupportedEncodingException {
		if (bytes.length == 0 || null == bytes) {
			return "";
		}
		String re = "";
		re = new String(bytes, "utf-8");
		return re;
	}

	private static String utfToString(byte[] data) {
		String str = null;
		try {
			str = new String(data, "utf-8");
		} catch (UnsupportedEncodingException e) {
		}
		return str;
	}
}
