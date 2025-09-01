package com.wipro.Food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Food.entity.Food.Food;
import com.wipro.Food.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	
	@Autowired
    FoodService foodService;

    @GetMapping
    List<Food> findAll() {
        return foodService.findAll();
    }

    @GetMapping("/{id}")
    Food findById(@PathVariable int id) {
        return foodService.findById(id);
    }

    @PostMapping
    void save(@RequestBody Food food) {
        foodService.save(food);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
        foodService.deleteById(id);
    }

}
