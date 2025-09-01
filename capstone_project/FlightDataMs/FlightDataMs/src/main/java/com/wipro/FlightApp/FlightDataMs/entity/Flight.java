package com.wipro.FlightApp.FlightDataMs.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "flights")
@Data
public class Flight {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="flight_number")
    private String flightNumber;

    @Column(name="aircraft_name")
    private String aircraftName;

    @Column(name="start_time")
    private LocalTime startTime;
    
    @Column(name="end_time")
    private LocalTime endTime;
    
    
    private String source;

    
    private String destination;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="travel_date")
    private LocalDate travelDate;

    
    private Double price;

    @Column(name="flight_class")
    private String flightClass;  

    @Column(name="departure_time")
    private String departureTime;  

    
    private Integer stops;  

    
    private String airline; 

    
    private String imageUrl;
    
    @Column(name="source_airport")
    private String sourceAirport;
    
    @Column(name="destination_airport")
    private String destinationAirport;

}
