package com.wipro.springmvcdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.springmvcdemo.service.CarService;
import com.wipro.springmvcdemo.service.repo.CarRepository;

public class CarServiceImpl implements CarService{

	 @Autowired
	    private CarRepository carRepository;

	    @Override
	    public List<String> getAllCars() {
	        return carRepository.getCarNames();
	    }

}
