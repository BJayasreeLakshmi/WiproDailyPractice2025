package com.wipro.encapsulation;

public class ChangeCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currency=0;
		try {
			
			int result=changeCurrency( currency);
			System.out.println(result);
			
		}catch(NumberFormatException e){
			//e.printStackTrace();
			System.out.println("Invalid Number");
			
		}
		

	}

	private static int changeCurrency(int currency)throws NumberFormatException {
		// TODO Auto-generated method stub
		if(currency==0) {
			throw new NumberFormatException("Invalid Number");
		}
		return currency*80;
	}

}
