package com.design.patterns.creational.factoyPattern;

public class MainClass {
	public static void main(String[] args) {
		ShapeFactory instance	= ShapeFactory.instance;
		
		try {
			instance.getShapeObjects("Triangle").draw();
			instance.getShapeObjects("Circle").draw();
			instance.getShapeObjects("Rectangle").draw();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
