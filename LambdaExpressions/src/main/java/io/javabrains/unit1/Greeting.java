package io.javabrains.unit1;

/*
 * Giving clue by annotating it so that no one should add more than one method in a class 
 * 
 */
@FunctionalInterface
public interface Greeting {

	public void perform();
	/*
	 * If "	public void another();"method added then "Invalid '@FunctionalInterface' annotation; Greeting is not a functional interface"
	 * Error will come as we annotated the class with @FunctionalInterface
	 */
	

}
