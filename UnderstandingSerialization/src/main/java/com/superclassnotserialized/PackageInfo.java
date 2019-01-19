package com.superclassnotserialized;

public class PackageInfo {

	
	/*
	 *Serialization: At the time of serialization, if any instance variable is inheriting from non-serializable superclass, 
	 *then JVM ignores original value of that instance variable and save default value to the file.
	 * 
	 *De- Serialization: At the time of de-serialization, if any non-serializable superclass is present, then JVM will execute 
	 *instance control flow in the superclass. To execute instance control flow in a class, JVM will always invoke default(no-arg) 
	 *constructor of that class.So every non-serializable superclass must necessarily contain default constructor, 
	 *otherwise we will get runtime-exception
	 * 
	 * 
	 */
}
