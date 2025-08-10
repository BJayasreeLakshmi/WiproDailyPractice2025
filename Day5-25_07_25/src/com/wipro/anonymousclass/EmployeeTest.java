package com.wipro.anonymousclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("W8","Jayasree",500, 23);
		Employee emp2=new Employee("W9","Lakshmi",400, 22);
		Employee emp3=new Employee("W3","Geetha",300, 21);
		Employee emp4=new Employee("W1","Sathish",2800, 22);
		Employee emp5=new Employee("W2","Vinay",1000, 23);
		
		List<Employee>list=new ArrayList<>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		Comparator<Employee> sortBySalary=(e1,e2)->{
			Long e=Long.valueOf(e1.getEmpSalary());
			Long e3=Long.valueOf(e2.getEmpSalary());
			return e.compareTo(e3);
			
		};
		Collections.sort(list, sortBySalary);
		System.out.println(list);
		
		
	}

}
