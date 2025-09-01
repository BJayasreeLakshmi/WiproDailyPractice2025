package com.wipro.FlightApp.BookingMs.dto;

import lombok.Data;

@Data
public class PaymentRequestDTO {
	private Long bookingId; 
    private String flightNumber;
    private String paymentMethod; 
    private String cardNumber;
    private String cardHolderName;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;
    private double amount;

}
