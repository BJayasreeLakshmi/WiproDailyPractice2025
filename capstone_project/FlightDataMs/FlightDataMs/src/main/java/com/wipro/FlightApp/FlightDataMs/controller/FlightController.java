package com.wipro.FlightApp.FlightDataMs.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.FlightApp.FlightDataMs.dto.CityDTO;
import com.wipro.FlightApp.FlightDataMs.dto.FlightSearchRequestDTO;
import com.wipro.FlightApp.FlightDataMs.entity.Flight;
import com.wipro.FlightApp.FlightDataMs.service.FlightService;

@RestController
@RequestMapping("/flights")

public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	
	@PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }
	
	@PostMapping("/search")
    public List<Flight> searchFlights(@RequestBody FlightSearchRequestDTO request) {
        return flightService.searchFlights(request);
    }
	
	
	@GetMapping("/cities")
	public List<CityDTO> getCities() {
	    List<Flight> allFlights = flightService.getAllFlights();

	    return allFlights.stream()
	            .map(f -> new CityDTO(f.getSource(), f.getSourceAirport()))
	            .distinct()
	            .collect(Collectors.toList());
	}
	
	@GetMapping("/flight/{flightNumber}")
    public Flight getFlightByNumber(@PathVariable String flightNumber) {
        Flight flight = flightService.getFlightByNumber(flightNumber);
        if (flight == null) {
            throw new RuntimeException("Flight not found");
        }
        return flight;
    }


}
