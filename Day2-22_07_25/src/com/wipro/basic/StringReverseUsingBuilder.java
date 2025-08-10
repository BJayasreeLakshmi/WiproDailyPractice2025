package com.wipro.basic;

public class StringReverseUsingBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str=new StringBuilder();
		str.append("MADAM");
		int end=str.length()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(end--)) {
				System.out.println("Not palin");
				return;
			}
		}
		System.out.println("palindrome");
		
		

	}

}
