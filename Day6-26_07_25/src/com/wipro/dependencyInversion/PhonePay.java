package com.wipro.dependencyInversion;

public class PhonePay implements Payment{

	@Override
	public void payment(double amount) {
		System.out.println(amount+" paid using PhonePay");
		
	}

}
