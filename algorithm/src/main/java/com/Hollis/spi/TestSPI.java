package com.Hollis.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @ClassName: TestSPI
 * @Date: Created in 2023/11/15 9:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestSPI {
	public static void main(String[] args) {
		ServiceLoader<Phone> shouts = ServiceLoader.load(Phone.class);
		Iterator<Phone> iterator= shouts.iterator();
		while(iterator.hasNext()){
			Phone service = iterator.next();
			service.getName();
		}

	}
}
