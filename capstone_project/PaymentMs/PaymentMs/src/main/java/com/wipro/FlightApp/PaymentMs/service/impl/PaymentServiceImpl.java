package com.wipro.FlightApp.PaymentMs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.FlightApp.PaymentMs.Entity.CreditCardPayment;
import com.wipro.FlightApp.PaymentMs.Entity.DebitCardPayment;
import com.wipro.FlightApp.PaymentMs.Repository.CreditCardPaymentRepository;
import com.wipro.FlightApp.PaymentMs.Repository.DebitCardPaymentRepository;
import com.wipro.FlightApp.PaymentMs.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
    private CreditCardPaymentRepository creditRepo;

    @Autowired
    private DebitCardPaymentRepository debitRepo;

    @Override
    public CreditCardPayment saveCreditPayment(CreditCardPayment payment) {
        payment.setStatus("initiated");
        return creditRepo.save(payment);
    }

    @Override
    public DebitCardPayment saveDebitPayment(DebitCardPayment payment) {
        payment.setStatus("initiated");
        return debitRepo.save(payment);
    }

}
