package com.wipro.collections;

public class RemoveEmployee {
	String employeeId;
	String empname;
	int empSalary;
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
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public RemoveEmployee(String employeeId, String empname, int empSalary, int empAge) {
		super();
		this.employeeId = employeeId;
		this.empname = empname;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "RemoveEmployee [employeeId=" + employeeId + ", empname=" + empname + ", empSalary=" + empSalary
				+ ", empAge=" + empAge + "]";
	}
	

}
