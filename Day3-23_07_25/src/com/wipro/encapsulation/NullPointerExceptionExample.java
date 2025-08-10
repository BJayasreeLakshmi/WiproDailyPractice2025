package com.wipro.encapsulation;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			String str=null;
			str=str.toUpperCase();
			System.out.println(str);
			
		}catch(NullPointerException ex){
			
			System.out.println("String is null");
			
		}

	}

}
