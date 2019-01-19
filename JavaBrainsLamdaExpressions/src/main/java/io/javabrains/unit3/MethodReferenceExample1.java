package io.javabrains.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
/*
 * This example shows if in a lambda expression having no argumemnt or have arguement which are then being passed to a method 
 * to perform method execution so this can be done by method refernce the rule is that both sides of lamda must be equal 
 *means if no arg lamda is created to call a method having no arg "() -> someMethod()"
 *
 */
		Thread t = new Thread(MethodReferenceExample1 :: printMessage); //() -> method() : MethodReferenceExample1 :: printMessage ==== () -> printMessage()
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
