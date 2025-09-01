package com.wipro.FlightApp.BookingMs.service;

import java.util.List;

import com.wipro.FlightApp.BookingMs.dto.FlightDTO;
import com.wipro.FlightApp.BookingMs.dto.FlightSearchRequestDTO;

public interface BookingService {
	
	List<FlightDTO> searchFlights(FlightSearchRequestDTO request);

	FlightDTO getFlightByNumber(String flightNumber);
	

}
