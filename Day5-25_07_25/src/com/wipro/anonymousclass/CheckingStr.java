package com.wipro.anonymousclass;

import java.util.function.Predicate;

public class CheckingStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p=str ->{ return str.equals(str.toUpperCase());};
		System.out.println(p.test("jayasree")); 
		Predicate<String> p2=str ->{ return str.equals(str.toUpperCase());};
		System.out.println(p2.test("JAYASREE"));
		}

	}


