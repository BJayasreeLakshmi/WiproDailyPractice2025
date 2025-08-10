package com.wipro.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	@GetMapping("/weather")
	String weather(@RequestParam String city,@RequestParam String title)
	{
		return "Weather in " +city+"   is cloudy "+title;
	}
	
	@GetMapping("/centigrade/{fahrenheit}")
	 float centigrade(@PathVariable int fahrenheit) {
		
		
		return (fahrenheit-32)*5/9;
		
	}

}
