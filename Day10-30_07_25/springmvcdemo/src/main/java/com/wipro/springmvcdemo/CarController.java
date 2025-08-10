package com.wipro.springmvcdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.wipro.springmvcdemo.service.CarService;


@Controller
public class CarController{
	
	@Autowired
	CarService carService;
	
	 String showCarList(Model model) {
	        List<String> carlist = carService.getAllCars();
	        model.addAttribute("carList", carlist);
	        return "carlist";
	 }
}

