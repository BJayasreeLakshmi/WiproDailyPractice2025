package com.wipro.FlightApp.BookingMs.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.FlightApp.BookingMs.repo.BookingRepo;

import jakarta.transaction.Transactional;

import java.util.Map;

@Service
public class PaymentResultListener {

    @Autowired
    private BookingRepo bookingRepository;

    @Transactional
    @KafkaListener(topics = "T2", groupId = "booking-ms-group")
    public void listenPaymentResult(Map<String, Object> paymentResult) {
        System.out.println("Received payment result: " + paymentResult);

        Long bookingId = Long.valueOf(paymentResult.get("bookingId").toString());
        String status = paymentResult.get("status").toString();

        bookingRepository.findById(bookingId).ifPresent(booking -> {
            booking.setStatus(status);
            bookingRepository.save(booking);
            System.out.println("Booking " + bookingId + " updated to status: " + status);
        });
    }
}

