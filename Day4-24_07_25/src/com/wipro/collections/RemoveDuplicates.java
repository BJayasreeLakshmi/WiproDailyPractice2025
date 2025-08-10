package com.wipro.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(10);
		
		Set<Integer>set=new HashSet<Integer>();
		
		set.addAll(list);
		System.out.println(set);
		
		

	}

}
