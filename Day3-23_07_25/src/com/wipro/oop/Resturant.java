package com.wipro.oop;

public class Resturant {
	
	String resturantName;
	String address;
	int phoneNumber;
	String email;
	String website;
	
	
	public Resturant(){
		
		
		
	}
	public Resturant(String resturantName,String address,int phoneNumber,String email,String website) {
		
		this.resturantName=resturantName;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.website=website;
	}
	
	public Resturant(String resturantName,int phoneNumber) {
		this.resturantName=resturantName;
		this.phoneNumber=phoneNumber;
	}


	public String getResurantName() {
		return resturantName;
	}


	public void setResurantName(String resurantName) {
		this.resturantName = resurantName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public String toString() {
		return "Resturant [resturantName=" + resturantName + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", website=" + website + ", getResurantName()=" + getResurantName()
				+ ", getAddress()=" + getAddress() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()="
				+ getEmail() + ", getWebsite()=" + getWebsite() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
