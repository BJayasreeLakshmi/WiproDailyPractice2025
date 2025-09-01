package com.wipro.FlightApp.PaymentMs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.FlightApp.PaymentMs.Entity.CreditCardPayment;
import com.wipro.FlightApp.PaymentMs.Entity.DebitCardPayment;
import com.wipro.FlightApp.PaymentMs.service.PaymentService;

@RestController
@RequestMapping("/payments")
@CrossOrigin("*")
public class PaymentController {
	
	@Autowired
    private PaymentService service;

    @PostMapping("/credit")
    public CreditCardPayment createCreditPayment(@RequestBody CreditCardPayment payment){
        return service.saveCreditPayment(payment);
    }

    @PostMapping("/debit")
    public DebitCardPayment createDebitPayment(@RequestBody DebitCardPayment payment){
        return service.saveDebitPayment(payment);
    }

}
