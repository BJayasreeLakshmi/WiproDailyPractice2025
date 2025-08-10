package com.wipro.basic;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="LISTEN";
		
		int count=0;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U'){
				count++;
			}
		}
		System.out.println("Vowels ="+count);
		System.out.println("Consonants ="+(str1.length()-count));

	}

}
