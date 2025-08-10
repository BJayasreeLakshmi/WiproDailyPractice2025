package com.wipro.oop;

public class CitiBank  implements BankOps{

	@Override
	public void deposit(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println(amount +" deposited into the account "+accNumber+" from Your CitiBank");
		
	}

	@Override
	public double withDraw(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println(amount +" withDrawn from the account "+accNumber+" from Your CitiBank");
		return 0;
	}

}
