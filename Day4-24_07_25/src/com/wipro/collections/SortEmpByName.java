package com.wipro.collections;

import java.util.Comparator;

public class SortEmpByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpname().compareTo(o2.getEmpname());
	}

}
