package com.wipro.streams;

import java.util.Optional;

public class OptionalExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Optional<Integer> optionalNumber = Optional.of(0);
		  optionalNumber.ifPresent(value -> System.out.println("Value is: " + value));
		  Integer result = optionalNumber.orElse(0);
	       System.out.println("Result: " + result);


	}

}
