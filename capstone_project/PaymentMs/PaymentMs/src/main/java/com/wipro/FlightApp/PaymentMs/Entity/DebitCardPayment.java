package com.wipro.FlightApp.PaymentMs.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="debit_card_payment")
public class DebitCardPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="booking_id")
    private String bookingId;
    
    
    @Column(name="card_number")
    private String cardNumber;
    
    
    @Column(name="card_holder_name")
    private String cardHolderName;
    
    
    @Column(name="expiry_month")
    private String expiryMonth;
    
    @Column(name="expiry_year")
    private String expiryYear;
    
    
    private String cvv;
    
    private Double amount;
    
    private String status; 
}
