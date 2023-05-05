package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: BuilderPatternDemo
 * @Date: Created in 2023/4/2 22:49
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " +vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " +nonVegMeal.getCost());
	}
}
