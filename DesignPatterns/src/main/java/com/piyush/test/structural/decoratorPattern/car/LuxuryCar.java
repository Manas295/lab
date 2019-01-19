package com.piyush.test.structural.decoratorPattern.car;

public class LuxuryCar extends Decorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("This is a luxury car.");
	}

}
