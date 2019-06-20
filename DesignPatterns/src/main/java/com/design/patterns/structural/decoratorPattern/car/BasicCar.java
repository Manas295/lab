package com.design.patterns.structural.decoratorPattern.car;

/*
 * The basic implementation of the component interface. 
 * We can have BasicCar class as our component implementation.
 */

public class BasicCar implements Car{
	public void assemble() {
		System.out.println("This is a basic car.");
	}
}
