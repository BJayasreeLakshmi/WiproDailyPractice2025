package com.wipro.basic;

public class ConditionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char shape='O';
		
		switch(shape) {
		
		case 'C':
			System.out.println("Its s Circle");
			break;
		
		case 'R':
			System.out.println("Its s Rectangle");
			break;
		
		case 'S':
			System.out.println("Its s Square");
			break;
		
		default:
			System.out.println("Other");
			break;
		}

	}

}
