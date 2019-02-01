package com.basic.Inteface.functioning;

public class TestingInterface implements C {

	public static void main(String[] args) {
		TestingInterface obj = new TestingInterface();
/*
 * This example is to show only that two interface having same method and a class implementing both interfaces
 * will not give any compile time error
 */
		obj.rust();
		//	obj.rust1();
	}

	public void rust() {
		System.out.println("Called Rust");		
	}

	/*public void rust1() {
		System.out.println("Called Rust1");		

	}*/

}
