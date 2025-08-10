package com.wipro.basic;

public class Conditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25;
		
		float floatingPointNum=-0.5f;
		
		int absValue=Math.abs(num);
		
		
		if(num==0) {
			System.out.println("Number is 0");
			
		}
		else {
			if(num>=1) {
				System.out.println("large");
			}
			else if(num<1) {
				System.out.println("small");
			}
		}
		
		if(absValue>=1) {
			System.out.println("Positive");
		}
		else if(absValue<=1) {
			System.out.println("Negative");
		}
		
		
		

	}

}
