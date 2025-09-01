package com.wipro.FlightApp.PaymentMs.service;

import com.wipro.FlightApp.PaymentMs.Entity.CreditCardPayment;
import com.wipro.FlightApp.PaymentMs.Entity.DebitCardPayment;

public interface PaymentService {

	CreditCardPayment saveCreditPayment(CreditCardPayment payment);

	DebitCardPayment saveDebitPayment(DebitCardPayment payment);

}
