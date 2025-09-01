package com.wipro.FlightApp.BookingMs.kafka;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.FlightApp.BookingMs.entity.Booking;
import com.wipro.FlightApp.BookingMs.repo.BookingRepo;


@Service
public class BookingConsumer {
	
	@Autowired
    private BookingRepo bookingRepo;

    @KafkaListener(topics = "T2", groupId = "booking_group")
    public void consumePaymentResult(Map<String, Object> paymentResult) {
        Long bookingId = Long.valueOf(String.valueOf(paymentResult.get("bookingId")));
        String status = (String) paymentResult.get("status");

        Booking booking = bookingRepo.findById(bookingId).orElse(null);
        if (booking != null) {
            booking.setStatus(status);
            bookingRepo.save(booking);
            System.out.println("Booking " + bookingId + " updated to status: " + status);
        }
    }

}
