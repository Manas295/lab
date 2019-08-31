package c_common_default_in_2_interface;
 
	public class MyClass implements Interface1, Interface2 {
 	
		 
	    @Override
	    public void method1(String str) {
	    }
	    
	    @Override
	    public void method2() {
	     }
	 
	    //it’s made mandatory to provide implementation for common default methods
	    @Override
	    public void log(String str){
	    	 
	    	Interface2.super.log("hello");                      // use super
	         
	    }
	    
/*
 * 1 ) If implementing class overrides the default method and provides its own functionality for the default 
method then the method of the class takes priority over the interface default methods.
As Example - If MyClass provides its own implementation of displayGreeting(), 
then the overridden method will be called not the default method in interface A or B.

2 ) When class implements both interfaces and both have the same default method, also the class is 
not overriding that method then the error will be thrown.
"Duplicate default methods named displayGreeting inherited from the interfaces"

3 ) In case when an interface extends another interface and both have the same default method, 
the inheriting interface default method will take precedence. Thus, if interface B extends interface A 
then the default method of interface B will take precedence.

 */
	    
	  
	 
}
