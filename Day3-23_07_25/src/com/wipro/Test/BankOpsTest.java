package com.wipro.Test;

import com.wipro.oop.CitiBank;
import com.wipro.oop.HdfcBank;

public class BankOpsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankOpsTest test=new BankOpsTest();
		HdfcBank hdfc=new HdfcBank();
		hdfc.deposit(1000,"265646346");
		CitiBank citi=new CitiBank();
		citi.withDraw(1500, "5656728898");
		

	}

}
