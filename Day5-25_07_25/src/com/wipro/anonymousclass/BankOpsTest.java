package com.wipro.anonymousclass;

public class BankOpsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankOps savingsAccount=new BankOps(){

			@Override
			public void deposit(double amount) {
				System.out.println(amount +" deposited into savings account");
				
			}
			
			
		};
		
		savingsAccount.deposit(1000);
		
		BankOps currentAccount=new BankOps() {

			@Override
			public void deposit(double amount) {
				// TODO Auto-generated method stub
				System.out.println(amount +" deposited into current account");
				
			}
			
		};
		currentAccount.deposit(2000);
	}

}
