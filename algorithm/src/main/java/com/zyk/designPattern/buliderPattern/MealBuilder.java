package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: MealBuilder
 * @Date: Created in 2023/4/2 22:49
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class MealBuilder {
	public Meal prepareVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
