package com.piyush.test.creational.factoyPattern;

public class ShapeFactoryClass {
	/*
	 * Make this class singleton for best practise.
	 */
	public static final ShapeFactoryClass instance	= new ShapeFactoryClass();
	
	private ShapeFactoryClass() {
	}
	
	public static ShapeFactoryClass getInstance() {
		return instance;
	}
	
	// This is a factory method.
	public Shape getShapeObjects(String shapeName) {
		if(shapeName.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(shapeName.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}else if(shapeName.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else {
			return null;
		}
	}
}
