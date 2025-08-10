package com.wipro.springmvcdemo.service.repo;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepository {
	 public List<String> getCarNames() {
	        return Arrays.asList("Audi", "Mercedes", "BMW");
	    }

}
