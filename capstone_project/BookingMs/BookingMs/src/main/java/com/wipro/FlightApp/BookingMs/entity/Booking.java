package com.wipro.FlightApp.BookingMs.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="bookings")
public class Booking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 
    private String source;

    
    private String destination;

    @Column(name="travel_date")
    private LocalDate travelDate;
    

    @Column(name="flight_number")
    private String flightNumber;
    
    @Column(name="travel_class")
    private String travelClass;
    
    
    @Column(name="aircraft_name")
    private String aircraftName;
    

    private double price;

    
    @Column(name="passenger_name")
    private String passengerName;

    
    private String status;

}
