package com.wipro.collections;

import java.util.Comparator;

public class EmpSortById implements Comparator<Employee>{

	

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeId().compareTo(o2.getEmployeeId());
	}

	

	
	


	
	
	
}
