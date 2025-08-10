package com.wipro.basic;

public class floatingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1=25.856f;
		float num2=45.567f;
		
		long result1=Math.round(num1);
		long result2=Math.round(num2);
		
		if(result1==result2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}

	}

}
