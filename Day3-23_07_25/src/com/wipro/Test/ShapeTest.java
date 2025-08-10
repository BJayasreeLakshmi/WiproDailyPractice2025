package com.wipro.Test;

import com.wipro.oop.Shape;
import com.wipro.oop.Square;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape=new Shape();
		Square square=new Square();
		square.setColour("Yellow");
		square.setNumberOfSides(4);
		System.out.println(square.getColour());
		System.out.println(square.getNumberOfSides());

	}

}
