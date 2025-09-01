package com.wipro.FlightApp.BookingMs.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.FlightApp.BookingMs.dto.FlightDTO;
import com.wipro.FlightApp.BookingMs.dto.FlightSearchRequestDTO;
import com.wipro.FlightApp.BookingMs.entity.Booking;
import com.wipro.FlightApp.BookingMs.kafka.BookingProducer;
import com.wipro.FlightApp.BookingMs.repo.BookingRepo;
import com.wipro.FlightApp.BookingMs.service.BookingService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.transaction.Transactional;

@Service
public class BookingServiceImpl implements BookingService {
	
	
	@Autowired
    private RestTemplate restTemplate;
	
	
   

    @Autowired
    private BookingRepo bookingRepository;

    @Autowired
    private BookingProducer bookingProducer;

	
    private final String FLIGHT_MS_URL = "http://localhost:8081/flights/search"; 

	

    @Override
    @CircuitBreaker(name = "flightService", fallbackMethod = "searchFlightsFallback")
    public List<FlightDTO> searchFlights(FlightSearchRequestDTO request) {
        FlightDTO[] flights = restTemplate.postForObject(FLIGHT_MS_URL, request, FlightDTO[].class);
        return Arrays.asList(flights);
    }

    @CircuitBreaker(name = "flightService", fallbackMethod = "getFlightByNumberFallback")
    public FlightDTO getFlightByNumber(String flightNumber) {
        try {
            String url = "http://localhost:8081/flights/flight/" + flightNumber; // FlightDataMS endpoint
            return restTemplate.getForObject(url, FlightDTO.class);
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<FlightDTO> searchFlightsFallback(FlightSearchRequestDTO request, Throwable t) {
        System.out.println("FlightDataMS is down! Returning empty list.");
        return Collections.emptyList();
    }

    public FlightDTO getFlightByNumberFallback(String flightNumber, Throwable t) {
        System.out.println("FlightDataMS is down! Returning empty flight.");
        return new FlightDTO();
    }
    
    @Transactional
    public Booking createBooking(Booking booking) {
        booking.setStatus("initiated"); 
        return bookingRepository.save(booking);
    }
    
    public void sendToKafka(Map<String, Object> paymentData) {
        bookingProducer.sendPaymentRequest(paymentData);
    }

}
