package com.design.patterns.structural.decoratorPattern.car;

public abstract class Decorator implements Car {
	Car car; // Has-a relation
	
	public Decorator(Car car) {
		this.car	= car;
	}
	
	public void assemble() {
		this.car.assemble();
	}
}
