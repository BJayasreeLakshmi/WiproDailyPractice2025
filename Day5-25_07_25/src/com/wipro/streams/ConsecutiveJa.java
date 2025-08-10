package com.wipro.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConsecutiveJa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("Jayasree","Jayanta","Jnanendra");
		
		 List<String> filteredName = list.stream()
		            .filter(name -> name.toLowerCase().contains("ja"))
		            .collect(Collectors.toList());
		 System.out.println("Filtered Names: " + filteredName);

	}

}
