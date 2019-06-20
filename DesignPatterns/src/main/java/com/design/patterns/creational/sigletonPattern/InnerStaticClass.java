package com.design.patterns.creational.sigletonPattern;

public class InnerStaticClass {
	public static void main(String[] args) {
		SingletonWithInnerStaticClass instance	= SingletonWithInnerStaticClass.getInstance();
		instance.doSomething();
	}
}

class SingletonWithInnerStaticClass{

	private SingletonWithInnerStaticClass() {}

	//This is inner static class for helping singleton
	private static class SingletonHelper{
		public static SingletonWithInnerStaticClass instance	= new SingletonWithInnerStaticClass();
	}


	public static SingletonWithInnerStaticClass getInstance() {
		return SingletonHelper.instance;
	}
	
	public void doSomething() {
		System.out.println("Do something is called.");
	}
}