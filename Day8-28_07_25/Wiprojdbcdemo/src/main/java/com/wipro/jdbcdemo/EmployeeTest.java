package com.wipro.jdbcdemo;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Employee emp1=new Employee("John",25,40000);
		Employee emp2=new Employee("Alice",35,60000);
		Employee emp3=new Employee("Bob",40,70000);
		Employee emp4=new Employee("Charlie",20,30000);
		Employee emp5=new Employee("David",38,55000);
		
		
		List<Employee>list=Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		
		double avgSalary=list.stream().filter(a->a.getAge()>30 &&a.getSalary()>50000)
				.mapToDouble(Employee::getSalary)
				.average().orElse(0.0);
		
		System.out.println("Average Salaray="+avgSalary);

	

}
}
