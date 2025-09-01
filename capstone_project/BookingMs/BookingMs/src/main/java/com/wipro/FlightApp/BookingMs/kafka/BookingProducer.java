package com.wipro.FlightApp.BookingMs.kafka;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookingProducer {
	
	 	@Autowired
	    private KafkaTemplate<String, Map<String, Object>> kafkaTemplate;

	    private final String TOPIC = "T1";

	    public void sendPaymentRequest(Map<String, Object> paymentData) {
	        kafkaTemplate.send(TOPIC, paymentData);
	        System.out.println("Sent payment request to T1: " + paymentData);
	    }

}
