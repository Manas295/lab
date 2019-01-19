package com.piyush.test.structural.decoratorPattern.car;

public class SportsCar extends Decorator {

	public SportsCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("This is a Sports car.");
	}

}
