package com.wipro.anonymousclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ListLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("Jayanta","Amit","Vasu");
		 Function<List<String>, List<Integer>> getLengths = name -> {
	            List<Integer> lengths = new ArrayList<>();
	            for (String s : list) {
	                lengths.add(s.length());
	            }
	            return lengths;
	        };
	        List<Integer> result = getLengths.apply(list);
	        

	        System.out.println(result);
	}

}
