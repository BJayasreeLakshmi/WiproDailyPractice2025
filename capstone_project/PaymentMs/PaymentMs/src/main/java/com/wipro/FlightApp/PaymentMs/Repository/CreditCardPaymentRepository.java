package com.wipro.FlightApp.PaymentMs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.FlightApp.PaymentMs.Entity.CreditCardPayment;

@Repository
public interface CreditCardPaymentRepository extends JpaRepository<CreditCardPayment, Long> {

}
