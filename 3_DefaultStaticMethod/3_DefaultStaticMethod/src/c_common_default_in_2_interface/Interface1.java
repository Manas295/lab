package c_common_default_in_2_interface;
 
	public interface Interface1 {
		 
	    void method1(String str);
	     
	    default void log(String str){
	        System.out.println("I1 logging::"+str); 
	    }

		 

		 
}
