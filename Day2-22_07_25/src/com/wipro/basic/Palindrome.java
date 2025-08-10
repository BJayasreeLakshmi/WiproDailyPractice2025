package com.wipro.basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="MADAM";
		int start=0;
		int end=str.length()-1;
		for(int i=start;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(end) && start!=end) {
				end--;
				
			}
			else {
				System.out.println("Not palindrome");
			}
		}
		System.out.println("Palindrome");
		
	}

}
