package com.zyk.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @ClassName: IdUtils
 * @Date: Created in 2022/12/3 16:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class IdUtils {


	public static String getId(){
		return UUID.randomUUID().toString().replace("-","");
	}

	@Test
	public void test(){
		System.out.println(IdUtils.getId());
	}

}
