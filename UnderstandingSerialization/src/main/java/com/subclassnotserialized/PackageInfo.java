package com.subclassnotserialized;

public class PackageInfo {
	/*
	 * 
	 * There is no direct way to prevent subclass from serialization in java. 
	 * One possible way by which a programmer can achieve this is by implementing the writeObject() and readObject() methods in the 
	 * subclass and needs to throw NotSerializableException from these methods. These methods are executed during serialization 
	 * and de-serialization respectively. By overriding these methods, we are just implementing our own custom serialization.
	 */

}
