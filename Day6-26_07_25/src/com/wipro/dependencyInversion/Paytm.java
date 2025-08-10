package com.wipro.dependencyInversion;

public class Paytm implements Payment{

	@Override
	public void payment(double amount) {
		System.out.println(amount+" paid using Paytm");
		
	}

}
