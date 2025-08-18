package com.wipro.employeedetails.service;

import java.util.List;

import com.wipro.employeedetails.entity.Employee;

public interface EmployeeService {
	
	
	Employee create(Employee emp);

	Employee update(int id, Employee emp);

	void delete(int id);

	Employee getById(int id);

	List<Employee> getByName(String name);

	List<Employee> getAll();

}
