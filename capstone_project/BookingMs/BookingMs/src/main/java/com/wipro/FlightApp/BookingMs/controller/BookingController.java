package com.wipro.FlightApp.BookingMs.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.FlightApp.BookingMs.dto.FlightDTO;
import com.wipro.FlightApp.BookingMs.dto.FlightSearchRequestDTO;
import com.wipro.FlightApp.BookingMs.dto.PaymentRequestDTO;
import com.wipro.FlightApp.BookingMs.entity.Booking;
import com.wipro.FlightApp.BookingMs.kafka.BookingProducer;
import com.wipro.FlightApp.BookingMs.repo.BookingRepo;
import com.wipro.FlightApp.BookingMs.service.BookingService;



@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
    private BookingService bookingService;
	
	@Autowired
	private BookingRepo bookingRepo;
	

    @Autowired
    private BookingProducer bookingProducer;
	
	@Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/search-flights")  
    public List<FlightDTO> searchFlights(@RequestBody FlightSearchRequestDTO searchRequest) {
        return bookingService.searchFlights(searchRequest);
    }
    
    
    
   
    @GetMapping("/flight/{flightNumber}")
    public ResponseEntity<FlightDTO> getFlightByNumber(@PathVariable String flightNumber) {
        FlightDTO flight = bookingService.getFlightByNumber(flightNumber);
        if (flight != null) {
            return ResponseEntity.ok(flight);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

    @PostMapping("/initiate-payment")
    public ResponseEntity<Map<String,Object>> initiatePayment(@RequestBody PaymentRequestDTO paymentRequest) {
        
        Booking booking = new Booking();
        booking.setFlightNumber(paymentRequest.getFlightNumber());
        booking.setPrice(paymentRequest.getAmount());
        booking.setStatus("initiated");
        bookingRepo.save(booking);

        
        Map<String, Object> kafkaMessage = Map.of(
            "bookingId", booking.getId(),
            "amount", booking.getPrice(),
            "paymentMethod", paymentRequest.getPaymentMethod(),
            "cardNumber", paymentRequest.getCardNumber(),
            "cardHolderName", paymentRequest.getCardHolderName(),
            "expiryMonth", paymentRequest.getExpiryMonth(),
            "expiryYear", paymentRequest.getExpiryYear(),
            "cvv", paymentRequest.getCvv()
        );

        
        bookingProducer.sendPaymentRequest(kafkaMessage);

       
        Map<String,Object> resp = Map.of(
            "bookingId", booking.getId(),
            "status", booking.getStatus()
        );

        return ResponseEntity.ok(resp);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
        return bookingRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
    
