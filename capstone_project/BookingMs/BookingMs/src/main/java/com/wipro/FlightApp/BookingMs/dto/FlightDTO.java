package com.wipro.FlightApp.BookingMs.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class FlightDTO {
	
	private String flightNumber;
    private String aircraftName;
    private String source;
    private String destination;
    private LocalDate travelDate;
    private Double price;
    private String flightClass;
    private String departureTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer stops;
    private String airline;
    private String imageUrl;
    private String sourceAirport;
    private String destinationAirport;

}
