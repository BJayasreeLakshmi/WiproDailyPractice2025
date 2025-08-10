package com.wipro.collections;


import java.lang.Comparable;



public  class Employee implements Comparable<Employee> {
	String employeeId;
	String empname;
	Integer empSalary;
	int empAge;
	
	
	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public Integer getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empname=" + empname + ", empSalary=" + empSalary + ", empAge="
				+ empAge + "]";
	}
	
	
	
	
	public Employee(String employeeId, String empname, Integer empSalary, int empAge) {
		super();
		this.employeeId = employeeId;
		this.empname = empname;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}



	@Override
	public int compareTo(Employee o) {
	Long e1=Long.valueOf(this.getEmpSalary());
		Long e2=Long.valueOf(o.getEmpSalary());
		//return e1.compareTo(e2);
		return this.getEmpSalary().compareTo(o.getEmpSalary());
	}
	
	

}
