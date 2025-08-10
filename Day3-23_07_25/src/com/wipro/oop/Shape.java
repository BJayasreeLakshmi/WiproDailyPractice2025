package com.wipro.oop;

public class Shape {
	
	String colour;
	int numberOfSides;
	
	public Shape() {
		
	}
	
	public Shape(String colour,int nuberOfSides) {
		this.colour=colour;
		this.numberOfSides=nuberOfSides;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	@Override
	public String toString() {
		return "Shape [colour=" + colour + ", numberOfSides=" + numberOfSides + "]";
	}
	
	

}
