package com.wipro.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {

	public static void main(String[] args) {
		
		
		List<String> names=Arrays.asList("mango","guava","pineapple","apple");
		List<String> sortedNames = names.stream()
                .sorted(String::compareTo) 
                .collect(Collectors.toList());
		
		sortedNames.forEach(System.out::println);

	}

}
