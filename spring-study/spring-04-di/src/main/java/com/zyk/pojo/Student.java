package com.zyk.pojo;

import java.util.*;

/**
 * @ClassName: Student
 * @Date: Created in 2022/12/8 11:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Student {
	private String name;
	private Address address;
	private String[] books;
	private List<String> hobbys;
	private Map<String,String> card;
	private Set<String> games;
	private String w;
	private Properties info;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	public List<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}

	public Map<String, String> getCard() {
		return card;
	}

	public void setCard(Map<String, String> card) {
		this.card = card;
	}

	public Set<String> getGames() {
		return games;
	}

	public void setGames(Set<String> games) {
		this.games = games;
	}

	public String getW() {
		return w;
	}

	public void setW(String w) {
		this.w = w;
	}

	public Properties getInfo() {
		return info;
	}

	public void setInfo(Properties info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Student{" +
			"name='" + name + '\'' +
			", address=" + address +
			", books=" + Arrays.toString(books) +
			", hobbys=" + hobbys +
			", card=" + card +
			", games=" + games +
			", w='" + w + '\'' +
			", info=" + info +
			'}';
	}
}
