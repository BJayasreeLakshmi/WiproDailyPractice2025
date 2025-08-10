package com.wipro.restdemo.entity;

public class DtoMobile {
	
	int id;
	String make;
	String modelNumber;
	int price;
	
	
	
	
	
	public DtoMobile() {
		super();
	}


	public DtoMobile(int id,String make, String modelNumber, int price) {
		super();
		this.id=id;
		this.make = make;
		this.modelNumber = modelNumber;
		this.price = price;
	}


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModelNumber() {
		return modelNumber;
	}


	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "DtoMobile [id=" + id + ", make=" + make + ", modelNumber=" + modelNumber + ", price=" + price
				+ ", getId()=" + getId() + ", getMake()=" + getMake() + ", getModelNumber()=" + getModelNumber()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
	
	
	
	
}
