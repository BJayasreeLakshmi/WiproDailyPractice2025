package com.wipro.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate birthDate=LocalDate.of(2001, 8, 4);
		LocalDate todayDate=LocalDate.now();
		Period age=Period.between(birthDate, todayDate);
		System.out.println(age.getYears());
	}

}
