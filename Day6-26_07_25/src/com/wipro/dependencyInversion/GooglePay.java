package com.wipro.dependencyInversion;

public class GooglePay implements Payment{

	@Override
	public void payment(double amount) {
		System.out.println(amount+" paid using GooglePay");
		
	}

}
