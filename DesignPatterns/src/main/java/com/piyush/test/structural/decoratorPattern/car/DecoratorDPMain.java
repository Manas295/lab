package com.piyush.test.structural.decoratorPattern.car;

public class DecoratorDPMain {

	public static void main(String[] args) {
		
		BasicCar basicCar	= new BasicCar();
		basicCar.assemble();
		
		System.out.println("---------------------------------------------");
		
		SportsCar sportsCar	= new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		System.out.println("---------------------------------------------");
		
		LuxuryCar luxuryCar	= new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
		
		System.out.println("---------------------------------------------");
		
		SportsCar luxusySportsCar	= new SportsCar(new LuxuryCar(new BasicCar()));
		luxusySportsCar.assemble();
		
	}
}
