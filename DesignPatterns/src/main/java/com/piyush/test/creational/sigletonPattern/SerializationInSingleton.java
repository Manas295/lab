package com.piyush.test.creational.sigletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationInSingleton {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		MySerializableSingletonClass instance1;
		MySerializableSingletonClass instance2;
		
		instance1	= MySerializableSingletonClass.getInstance();
		instance1.doSomething();
		System.out.println(instance1.hashCode());
		
		//Serialize instance1
		ObjectOutput objectOutput	= new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
		objectOutput.writeObject(instance1);
		objectOutput.flush();
		objectOutput.close();
		
		//De-serialize object
		ObjectInput	objectInput	= new ObjectInputStream(new FileInputStream("filename.ser"));
		instance2	= (MySerializableSingletonClass) objectInput.readObject();
		instance2.doSomething();
		System.out.println(instance2.hashCode());
		
		
		
		
		
	}
}

class MySerializableSingletonClass implements Serializable{
	// Using inner static class for singleton

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MySerializableSingletonClass() {
		
	}
	
	private static class SingletonHelper{
		public static final MySerializableSingletonClass instance	= new MySerializableSingletonClass(); 
	}

	public static MySerializableSingletonClass getInstance() {
		return SingletonHelper.instance;
	}
	
	public void doSomething() {
		System.out.println("Do something called");
	}
	
	/*
	 * readResolve Method is used to prevent copying of single object.
	 */
	public Object readResolve() {
		return getInstance();
	}
}
