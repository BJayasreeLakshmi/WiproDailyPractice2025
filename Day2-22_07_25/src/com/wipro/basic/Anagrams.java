package com.wipro.basic;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str1=new StringBuilder();
		str1.append("listen");
		StringBuilder str2=new StringBuilder();
		str2.append("silent");
		if(str1.length()!=str2.length()) {
			System.out.println("Not anagrams");
		}
		else {
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					continue;
				}
				else {
					System.out.println("Not anagrams");
				}
			}
		}
		System.out.println("Anagrams");
		}
	}

}
