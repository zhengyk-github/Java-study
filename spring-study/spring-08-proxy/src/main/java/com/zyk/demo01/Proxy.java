package com.zyk.demo01;

/**
 * @ClassName: Proxy
 * @Date: Created in 2022/12/12 15:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Proxy implements Rent{
	public Host host ;

	public Proxy() {
	}

	public Proxy(Host host) {
		this.host = host;
	}


	@Override
	public void rent() {
		host.rent();
		seeHost();
		heTong();
		fee();
	}

	public void seeHost(){
		System.out.println("中介带你看房");
	}

	public void heTong(){
		System.out.println("中介和你签合同");
	}

	public void fee(){
		System.out.println("中介收房租");
	}


}
