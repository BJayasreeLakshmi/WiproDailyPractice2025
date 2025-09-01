package com.wipro.FlightApp.FlightDataMs.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.FlightApp.FlightDataMs.dto.FlightSearchRequestDTO;
import com.wipro.FlightApp.FlightDataMs.entity.Flight;
import com.wipro.FlightApp.FlightDataMs.repo.FlightRepository;
import com.wipro.FlightApp.FlightDataMs.service.FlightService;


@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository flightRepo;
	
	
	@Override
	public Flight addFlight(Flight flight) {
	
		return flightRepo.save(flight);
	}

	@Override
    public List<Flight> searchFlights(FlightSearchRequestDTO request) {
        List<Flight> allFlights = flightRepo.findAll();

        return allFlights.stream()
            .filter(f -> request.getSource() == null || f.getSource().equalsIgnoreCase(request.getSource()))
            .filter(f -> request.getDestination() == null || f.getDestination().equalsIgnoreCase(request.getDestination()))
            .filter(f -> request.getTravelDate() == null || f.getTravelDate().isEqual(request.getTravelDate()))
            .filter(f -> request.getFlightClass() == null || f.getFlightClass().equalsIgnoreCase(request.getFlightClass()))
            .filter(f -> request.getDepartureTime() == null || f.getDepartureTime().equalsIgnoreCase(request.getDepartureTime()))
            .filter(f -> request.getStops() == null || f.getStops().equals(request.getStops()))
            .filter(f -> request.getAirline() == null || f.getAirline().equalsIgnoreCase(request.getAirline()))
            .filter(f -> request.getMinPrice() == null || f.getPrice() >= request.getMinPrice())
            .filter(f -> request.getMaxPrice() == null || f.getPrice() <= request.getMaxPrice())
            .collect(Collectors.toList());
    }

	@Override
	public List<Flight> getAllFlights() {
	    return flightRepo.findAll();
	}

	 public Flight getFlightByNumber(String flightNumber) {
	        return flightRepo.findByFlightNumber(flightNumber);
	    }
	
	
}


