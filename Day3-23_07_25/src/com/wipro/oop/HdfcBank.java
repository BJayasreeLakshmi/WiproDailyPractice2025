package com.wipro.oop;

public class HdfcBank implements BankOps{

	@Override
	public void deposit(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println(amount +" deposited into Your HDFC "+accNumber+" from your HDFC Bank");
		
	}

	@Override
	public double withDraw(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println(amount +" withDrawn from the account "+accNumber+" from your HDFC Bank");
		return 0;
	}

}
