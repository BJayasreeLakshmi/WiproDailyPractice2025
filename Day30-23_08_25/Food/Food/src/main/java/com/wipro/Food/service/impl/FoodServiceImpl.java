package com.wipro.Food.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Food.entity.Food.Food;
import com.wipro.Food.repo.FoodRepo;
import com.wipro.Food.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{
	
	 	@Autowired
	    FoodRepo foodRepo;

	    @Override
	    public List<Food> findAll() {
	        return foodRepo.findAll();
	    }

	    @Override
	    public Food findById(int id) {
	        return foodRepo.findById(id).orElse(null);
	    }

	    @Override
	    public void save(Food food) {
	        foodRepo.save(food);
	    }

	    @Override
	    public void deleteById(int id) {
	        foodRepo.deleteById(id);
	    }

}
