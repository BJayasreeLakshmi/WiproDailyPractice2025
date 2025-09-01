package com.wipro.FlightApp.BookingMs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.FlightApp.BookingMs.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
