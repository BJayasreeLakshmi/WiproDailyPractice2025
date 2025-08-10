package com.wipro.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DifferenceOfSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		Set<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(30);
		set2.add(60);
		set2.add(40);
		set2.add(70);
		set2.add(0);
		set.removeAll(set2);
		System.out.println(set);
		
		
		
		
		

	}

}
