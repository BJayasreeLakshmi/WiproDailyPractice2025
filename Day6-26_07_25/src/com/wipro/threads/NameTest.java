package com.wipro.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameTest {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Jayanta");
		list.add("Amit");
		
		VowelThread v1=new VowelThread(list);
		ConsonantThread c1=new ConsonantThread(list);
		
		Thread t1 = new Thread(()->v1.run());
		Thread t2=new Thread(()->c1.run());
		
		t1.start();
		t2.start();
		
		System.out.println(list);

	}

}
