package com.wipro.oop;

public abstract class Animal {
	
	String typeOfAnimal;
	String colour;
	String habitat;
	
	
	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}
	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return "Animal [typeOfAnimal=" + typeOfAnimal + ", colour=" + colour + ", habitat=" + habitat + "]";
	}
	
	public abstract void moving();
	public abstract void ableToTalk();
	
	

}
