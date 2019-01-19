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
	    	 
	    	//Interface1.super.log("hello");                      // use super
	         
	    }
	    
	  
	 
}
