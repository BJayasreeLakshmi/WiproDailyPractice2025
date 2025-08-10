package com.wipro.anonymousclass;

import java.time.LocalDate;
import java.util.function.Supplier;

public class NextDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s=()-> { return LocalDate.now().plusDays(1).getDayOfWeek().toString();
		};
		System.out.println(s.get());
	}

}
