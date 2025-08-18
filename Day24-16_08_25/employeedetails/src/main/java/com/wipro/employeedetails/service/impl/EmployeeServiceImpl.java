package com.wipro.employeedetails.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.employeedetails.entity.Employee;
import com.wipro.employeedetails.exception.EmployeeNotFoundException;
import com.wipro.employeedetails.repo.EmployeeRepo;
import com.wipro.employeedetails.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
    public Employee create(Employee emp) {
        return employeeRepo.save(emp);
    }

	@Override
	public Employee update(int id, Employee emp) {
		// TODO Auto-generated method stub
		 Employee existing = employeeRepo.findById(id)
				 .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
	        existing.setEmployeeName(emp.getEmployeeName());
	        existing.setType(emp.getType());
	        existing.setAddress(emp.getAddress());
	        existing.setDepartment(emp.getDepartment());
	        return employeeRepo.save(existing);
		
	}

	@Override
	public void delete(int id) {
		if (!employeeRepo.existsById(id)) {
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
		employeeRepo.deleteById(id);
		
	}

	@Override
	public Employee getById(int id) {
		return employeeRepo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
	}

	@Override
	public List<Employee> getByName(String name) {
		return employeeRepo.findByEmployeeName(name);
		 
	}
	@Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

}
