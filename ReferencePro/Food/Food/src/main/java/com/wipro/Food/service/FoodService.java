package com.wipro.Food.service;

import java.util.List;

import com.wipro.Food.entity.Food.Food;



public interface FoodService {

	 	List<Food> findAll();
	    Food findById(int id);
	    void save(Food food);
	    void deleteById(int id);
}
