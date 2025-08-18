package com.wipro.employeedetails.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employees")
@Data
public class Employee {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id;
	
	@Column(name="emp_name")
	String employeeName;
	
	
	@Column(nullable = false)
    String type; 
	
	@Column(name="emp_address")
	String address;      
	
	@Column(name="emp_department")
    String department;
	
	
	

}
