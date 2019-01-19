package c_common_default_in_2_interface;

public interface Interface2 {

	
	 void method2();
     
	 default void log(String str){
	        System.out.println("I2 logging::"+str);
	    }
	 
}
