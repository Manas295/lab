package com.oopsconcept.polymorphism;
/*
 * Dynamic Polymorphism is the mechanism by which multiple methods can be defined 
 * with same name and signature in the superclass and subclass. 
 * The call to an overridden method are resolved at run time.
 */


public class DynamicOrRuntimePolymorphism {
	public static void main(String args[]) {
		Parent parent	= new Child();
		parent.nameOfClass();
		//parent.display();
		parent.doSomething();
	}
}

/*
 * https://www.javatpoint.com/access-modifiers
 * 
 * If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
 */


class Parent{
	void nameOfClass() {
		System.out.println("This is parent class");
	}
	
	public void doSomething() {
		System.out.println("This is parent class soSomething method");
	}
}

class Child extends Parent{
	@Override
	public void nameOfClass() {
		System.out.println("This is child class");
	}
	
	public void display() {
		System.out.println("Display of child class.");
	}
}
