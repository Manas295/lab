package com.piyush.test.creational.factoyPattern;

public class MainClass {
	public static void main(String[] args) {
		ShapeFactoryClass instance	= ShapeFactoryClass.instance;
		
		instance.getShapeObjects("triangle").draw();
		instance.getShapeObjects("circle").draw();
		instance.getShapeObjects("rectangle").draw();
	}
}
