package com.wipro.FlightApp.FlightDataMs.service;

import java.util.List;
import java.util.Map;

import com.wipro.FlightApp.FlightDataMs.dto.FlightSearchRequestDTO;
import com.wipro.FlightApp.FlightDataMs.entity.Flight;

public interface FlightService {
	 	Flight addFlight(Flight flight);
	    List<Flight> searchFlights(FlightSearchRequestDTO request);
	    List<Flight> getAllFlights();
	    Flight getFlightByNumber(String flightNumber);


}
