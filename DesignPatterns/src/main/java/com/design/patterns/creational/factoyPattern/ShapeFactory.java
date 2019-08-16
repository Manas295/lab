package com.design.patterns.creational.factoyPattern;

public class ShapeFactory {
	/*
	 * Make this class singleton for best practise.
	 */
	public static final ShapeFactory instance	= new ShapeFactory();
	
	private ShapeFactory() {
	}
	
	public static ShapeFactory getInstance() {
		return instance;
	}
	
	// This is a factory method.
/*	public Shape getShapeObjects(String shapeName) {
		if(shapeName.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(shapeName.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}else if(shapeName.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else {
			return null;
		}
	}*/
	
	
	// This is a factory method. using Refelection
	public static Shape getShapeObjects(String shapeClass) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (Shape) Class.forName("com.design.patterns.creational.factoyPattern."+shapeClass).newInstance(); 
	}
}
