package com.wipro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("W8","Jayasree",5, 23000);
		Employee emp2=new Employee("W9","Lakshmi",4, 22000);
		Employee emp3=new Employee("W3","Geetha",3, 85000);
		Employee emp4=new Employee("W1","Sathish",2, 22000);
		Employee emp5=new Employee("W2","Vinay",1, 23);
		
		List<Employee>list=new ArrayList<>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		System.out.println("-----Sorting based on salary-----");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("----Sorting based on empID----");
		Collections.sort(list, new EmpSortById());
		System.out.println(list);
		System.out.println("-----Sorting based on Names-------");
		Collections.sort(list, new SortEmpByName());
		System.out.println(list);
		
		Iterator<Employee>it=list.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getEmpSalary()>80000) {
				it.remove();
			}
			
		}
		System.out.println(list);
		
		
		
		
		

	}

}
