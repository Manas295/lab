package com.design.patterns.creational.sigletonPattern;

public class LazyInitialization {
	public static void main(String[] args) {
		SingletonClassForLazyInitialization	instance	= SingletonClassForLazyInitialization.getInstance();
		instance.doSomething();
	}
}


class SingletonClassForLazyInitialization {

	private static SingletonClassForLazyInitialization instance;
	
	private SingletonClassForLazyInitialization() {}

	public static SingletonClassForLazyInitialization getInstance() {
		/**
		 * double checked locking principle for making it thread safe.
		 */

		if(instance == null) {
			synchronized(SingletonClassForLazyInitialization.class) {
				if(instance == null) {
					instance	= new SingletonClassForLazyInitialization();
				}
			}
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Singleton class is doing something.");
	}
}
