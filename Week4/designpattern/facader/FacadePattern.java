package com.bridgeit.designpattern.facader;

public class FacadePattern {

	public static void main(String[] args) {
		ShapeMaker shapemaker=new ShapeMaker();
		shapemaker.drawCircle();
		shapemaker.drawRectangle();
		shapemaker.drawSquare();
	}
}
