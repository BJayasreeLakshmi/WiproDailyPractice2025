package com.wipro.employeedetails.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.employeedetails.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	List<Employee> findByEmployeeName(String employeeName);
}
