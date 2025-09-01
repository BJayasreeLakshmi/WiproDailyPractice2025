package com.wipro.FlightApp.FlightDataMs.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class FlightSearchRequestDTO {
	
	private String source;
    private String destination;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate travelDate;
    private String flightClass;
    private String departureTime;
    private Integer stops;
    private String airline;
    private Double minPrice;
    private Double maxPrice;
    private String sourceAirport;
    private String destinationAirport;
    

}
