package com.wipro.FlightApp.FlightDataMs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.FlightApp.FlightDataMs.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

	Flight findByFlightNumber(String flightNumber);
}
