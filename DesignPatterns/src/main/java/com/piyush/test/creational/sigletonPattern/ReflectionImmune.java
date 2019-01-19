package com.piyush.test.creational.sigletonPattern;

import java.lang.reflect.Constructor;

public class ReflectionImmune {
	public static void main(String[] args) throws Exception {
		MyReflectionImmuneSingletonClass instance1;
		MyReflectionImmuneSingletonClass instance2;
		
		instance1	= MyReflectionImmuneSingletonClass.getInstance();
		instance1.doSomething();
		
		// Making new object with reflection
		Class clazz	= MyReflectionImmuneSingletonClass.class;
		Constructor dConstructor	= clazz.getDeclaredConstructor();
		dConstructor.setAccessible(true);
		instance2	= (MyReflectionImmuneSingletonClass) dConstructor.newInstance();
		
		instance2.doSomething();
	}
}

class MyReflectionImmuneSingletonClass{
	private static final MyReflectionImmuneSingletonClass instance	= new MyReflectionImmuneSingletonClass();
	
	private MyReflectionImmuneSingletonClass() {
		
		// Making class reflection immune
		if(instance!=null) {
			throw new RuntimeException("Reflection is not supported.");
		}
	}
	
	public static MyReflectionImmuneSingletonClass getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Do something is called.");
	}
}