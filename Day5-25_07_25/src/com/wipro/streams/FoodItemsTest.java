package com.wipro.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoodItemsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItems f1=new FoodItems("Noodles", "Veg", "Chinese",100);
		FoodItems f2=new FoodItems("FriedRice", "Non Veg", "Chinese",180);
		FoodItems f3=new FoodItems("Biryani","Nonveg","Indian",300);
		FoodItems f4=new FoodItems("Pizza", "Veg", "Continental", 300);
		
		List<FoodItems> list=new ArrayList<FoodItems>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		
		List<FoodItems> chineseFood=list.stream()
				.filter(item->item.getCuisine().equals("Chinese"))
				.collect(Collectors.toList());
		
		System.out.println(chineseFood);
	
		FoodItems expChinesesFood=list.stream()
				.filter(item->item.getCuisine().equals("Chinese"))
				.reduce((item1, item2)->item1.getPrice()>item2.getPrice() ?item1:item2)
				.orElse(null);
		System.out.println(expChinesesFood);
		
	};
	


}
