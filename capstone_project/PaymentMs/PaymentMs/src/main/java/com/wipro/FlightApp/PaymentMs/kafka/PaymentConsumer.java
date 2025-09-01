package com.wipro.FlightApp.PaymentMs.kafka;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.wipro.FlightApp.PaymentMs.Entity.CreditCardPayment;
import com.wipro.FlightApp.PaymentMs.Entity.DebitCardPayment;
import com.wipro.FlightApp.PaymentMs.Repository.CreditCardPaymentRepository;
import com.wipro.FlightApp.PaymentMs.Repository.DebitCardPaymentRepository;

@Component
public class PaymentConsumer {

    @Autowired
    private CreditCardPaymentRepository creditCardPaymentRepo;

    @Autowired
    private DebitCardPaymentRepository debitCardPaymentRepo;

    @Autowired
    private KafkaTemplate<String, Map<String, Object>> kafkaTemplate;

    private final String RESULT_TOPIC = "T2";

    @KafkaListener(topics = "T1", groupId = "payment_group")
    public void consumePaymentRequest(Map<String, Object> paymentRequest) {
        System.out.println("Payment MS received: " + paymentRequest);

        boolean success = true;
        String status = success ? "successful" : "failed";
        String paymentMethod = paymentRequest.get("paymentMethod").toString();

        
        String bookingId = paymentRequest.get("bookingId").toString();
        String expiryMonth = paymentRequest.get("expiryMonth").toString();
        String expiryYear = paymentRequest.get("expiryYear").toString();
        String cardHolderName = paymentRequest.get("cardHolderName").toString();
        String cardNumber = paymentRequest.get("cardNumber").toString();
        String cvv = paymentRequest.get("cvv").toString();
        Double amount = Double.valueOf(paymentRequest.get("amount").toString());

        
        if ("Credit Card".equalsIgnoreCase(paymentMethod)) {
            CreditCardPayment payment = new CreditCardPayment();
            payment.setBookingId(bookingId);
            payment.setCardHolderName(cardHolderName);
            payment.setCardNumber(cardNumber);
            payment.setExpiryMonth(expiryMonth);
            payment.setExpiryYear(expiryYear);
            payment.setCvv(cvv);
            payment.setAmount(amount);
            payment.setStatus(status);

            creditCardPaymentRepo.save(payment);
            System.out.println(" Credit card payment saved for booking: " + bookingId);

        } else if ("Debit Card".equalsIgnoreCase(paymentMethod)) {
            DebitCardPayment payment = new DebitCardPayment();
            payment.setBookingId(bookingId);
            payment.setCardHolderName(cardHolderName);
            payment.setCardNumber(cardNumber);
            payment.setExpiryMonth(expiryMonth);
            payment.setExpiryYear(expiryYear);
            payment.setCvv(cvv);
            payment.setAmount(amount);
            payment.setStatus(status);

            debitCardPaymentRepo.save(payment);
            System.out.println("Debit card payment saved for booking: " + bookingId);
        }

        
        Map<String, Object> result = new HashMap<>();
        result.put("bookingId", bookingId);
        result.put("status", status);

        kafkaTemplate.send(RESULT_TOPIC, result);
        System.out.println("Payment result sent to T2: " + result);
    }
}



