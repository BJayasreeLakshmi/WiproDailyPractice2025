package com.wipro.Test;

import java.util.Scanner;

import com.wipro.oop.Gpay;
import com.wipro.oop.PaymentMethod;
import com.wipro.oop.PhonePay;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethod pay=new Gpay();
		pay.pay(34.0);
		PaymentMethod pay1=new PhonePay();
		pay1.pay(64.0);
		
		

	}

}
