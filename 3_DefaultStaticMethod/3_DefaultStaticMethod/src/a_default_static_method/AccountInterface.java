package a_default_static_method;


public interface AccountInterface  {

	String getName();
	void setName(String name);
	int getBal();
	void setBal(int bal);
	
	default String getAccountInfoDefault()
	{  
		return "Account Interface default: "+getName()+" , "+getBal();
	} 
	  
      /**A default method cannot override a method from java.lang.Object **/
	  
	   
	     //default public  String toString() {  }
	  
  

	
	
	
	
	
   
	static String getAccountInfoStatic(SavingAccount p)
	{
		 return "Account interface Static : "+p.getName()+" , "+p.getBal();
	}  
		
}
/*
1 ) Static methods are similar to default methods except that we can’t override them in the implementation classes.
2 ) This feature helps us in avoiding undesired results in case of poor implementation in child classes. 

*/

