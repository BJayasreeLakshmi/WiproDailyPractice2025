package com.wipro.FlightApp.BookingMs.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.FlightApp.BookingMs.dto.CityDTO;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;



@RestController
public class CityController {

	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name = "flightService", fallbackMethod = "citiesFallback")
	@GetMapping("/cities")
	public ResponseEntity<CityDTO[]> getCities() {
	    CityDTO[] cities = restTemplate.getForObject(
	        "http://localhost:8081/flights/cities",
	        CityDTO[].class
	    );
	    return ResponseEntity.ok(cities);
	}
	
	public ResponseEntity<CityDTO[]> citiesFallback(Throwable t) {
	    System.out.println("Circuit breaker triggered for cities: " + t.getMessage());
	    return ResponseEntity.ok(new CityDTO[0]); 
	}

}
