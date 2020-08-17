package com.subclassnotserialized;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialize {
	public static void main(String[] args) throws Exception {
		B b1 = new B(10,20);

		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);

		// Serializing B's object 

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);


		oos.writeObject(b1);

		// closing streams
		oos.close();
		fos.close();

		System.out.println("Object has been serialized");

		// De-Serializing B's] object
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		B b2 = (B)ois.readObject();


		ois.close();
		fis.close();

		System.out.println("Object has been deserialized");

		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);

	}

}

class A implements Serializable
{
	int i=0;
	public A(int i)
	{
		this.i = i;
	}

}
class B extends A
{
	int j;
	public B(int i,int j)
	{
		super(i);
		this.j = j;

	}
	// By implementing writeObject method, 
	// we can prevent
	// subclass from serialization
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		throw new NotSerializableException();
	}

	// By implementing readObject method, 
	// we can prevent
	// subclass from de-serialization
	private void readObject(ObjectInputStream in) throws IOException
	{
		throw new NotSerializableException();
	}
}