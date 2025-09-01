package com.wipro.FlightApp.PaymentMs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.FlightApp.PaymentMs.Entity.DebitCardPayment;

public interface DebitCardPaymentRepository extends JpaRepository<DebitCardPayment, Long>{

}
