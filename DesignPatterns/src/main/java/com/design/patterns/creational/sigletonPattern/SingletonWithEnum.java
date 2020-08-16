package com.design.patterns.creational.sigletonPattern;

/*
 * Best way for singleton design Pattern. Although it DOES NOT allow lazy initialization.
 * 
 * As enums don’t have any constructor so it is not possible for Reflection to utilize it. 
 * Enums have their by-default constructor, we can’t invoke them by ourself. 
 * JVM handles the creation and invocation of enum constructors internally.
 * As enums don’t give their constructor definition to the program, 
 * it is not possible for us to access them by Reflection also. Hence, 
 * reflection can’t break singleton property in case of enums.
 */

public class SingletonWithEnum {
	public static void main(String[] args) {
		MySingletonEnum.INSTANCE.doSoemthing();
	}
}

enum MySingletonEnum{
	INSTANCE;

	public void doSoemthing() {
		System.out.println("Do something is called ..");
	}
}