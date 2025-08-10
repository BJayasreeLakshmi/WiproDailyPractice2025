package com.wipro.collections;

import java.util.ArrayList;

public class ArrayListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(60);
		System.out.println(list);

	}

}
