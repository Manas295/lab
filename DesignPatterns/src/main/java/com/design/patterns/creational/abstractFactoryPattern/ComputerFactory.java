
package com.design.patterns.creational.abstractFactoryPattern;


public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
