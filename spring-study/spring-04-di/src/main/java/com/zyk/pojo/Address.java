package com.zyk.pojo;

/**
 * @ClassName: Address
 * @Date: Created in 2022/12/8 11:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Address {
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address{" +
			"address='" + address + '\'' +
			'}';
	}
}
