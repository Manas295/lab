package a_default_static_method;

import java.util.ArrayList; 
import java.util.List; 

public class UseDefault {

	public static void main(String[] args) { 
		
		SavingAccount  ob = new SavingAccount("Ajit",1244);
		System.out.println(ob.getAccountInfoDefault());
		
		
		
		//Using static function
		//System.out.println(AccountInterface.getAccountInfoStatic(ob));

		
		
	
	}
}