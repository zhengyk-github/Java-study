package typeConversion;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName: byteToLong
 * @Date: Created in 2023/2/10 13:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class byteToLong {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "123456";
		byte[] bt = str.getBytes("utf-8");
		String bttostr= new String(bt,"utf-8");
		Long l = Long.parseLong(bttostr);
		System.out.println(l);

	}
}
