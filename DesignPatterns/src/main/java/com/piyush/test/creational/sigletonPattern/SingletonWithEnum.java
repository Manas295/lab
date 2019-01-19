package com.piyush.test.creational.sigletonPattern;

/*
 * Best way for singleton design Pattern. Although it DOES NOT allow lazy initialization.
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