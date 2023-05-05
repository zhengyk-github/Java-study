package com.zyk.designPattern.buliderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Meal
 * @Date: Created in 2023/4/2 22:47
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item){
		items.add(item);
	}

	public float getCost(){
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems(){
		for (Item item : items) {
			System.out.print("Item : "+item.name());
			System.out.print(", Packing : "+item.packing().pack());
			System.out.println(", Price : "+item.price());
		}
	}
}