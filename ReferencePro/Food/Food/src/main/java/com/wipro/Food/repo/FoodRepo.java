package com.wipro.Food.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.Food.entity.Food.Food;

@Repository
public interface FoodRepo extends JpaRepository<Food, Integer>{

}
