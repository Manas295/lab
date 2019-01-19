package com.piyush.test.creational.sigletonPattern;

public class EagerInitialization {
	public static void main(String[] args) {
		SingletonClass singletonClass	= SingletonClass.getInstance();
		singletonClass.doSomething();
	}
}



class SingletonClass{
	
	private static final SingletonClass instance	= new SingletonClass();
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Singleton class is doing something");
	}
}
