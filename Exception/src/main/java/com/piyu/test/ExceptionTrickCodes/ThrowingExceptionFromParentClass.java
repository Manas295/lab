package com.piyu.test.ExceptionTrickCodes;

public class ThrowingExceptionFromParentClass {

	public static void main(String[] args) {
		ParentClass parentClass	= new ChildClass();
		//parentClass.display(); //This will give a compile time exception
		parentClass.display1();
		
		ChildClass childClass	= new ChildClass();
		childClass.display();
		childClass.display1();
	}
}

class ParentClass {

	public void display() throws Exception{
		System.out.println("Display of parent class is called");
	}
	
	public void display1() throws RuntimeException{
		System.out.println("Display1 of parent class is called");
	}
}

class ChildClass extends ParentClass {

	@Override
	public void display() {
		System.out.println("Display of child class is called");
	}
	
	@Override
	public void display1() {
		System.out.println("Display1 of child class is called");
	}
}
