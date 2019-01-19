package impl1;
  

import interfaces.I1;
import interfaces.I2; 
import interfaces.I3;
import interfaces.I4;

public class ImplTestUsingLambda {
	
	public static void main(String[] args) {		
				
		//no args and no return
		I1 ref = () -> System.out.println("this is from I1 using Lambda");		
		ref.m1();
				 
		
		I2 ref2 =()-> 10*2;
		int d=ref2.m2();
		System.out.println(d);
		
		// method with no args and int as return type
		I2 re =()-> { 
			System.out.println("hello");
			return 10;
			};	 	
		System.out.println("I2.m2() =  "+ref2.m2()); 
		
		
		//method with int args and no return 
		I3 ref3 =i -> System.out.println("data "+i);
		 //type is inferred  
		ref3.m3(12);
		
		// with arg and int as return			
		I4 ref4 =(i) -> i/2; 
		System.out.println("I4.m4() = "+ref4.m4(20));
		
		// more than 1 stmt
		I4 ref5 =(int i) -> {
			System.out.println("I4.m4() ");
			return 2*i;	
			};
		System.out.println(ref5.m4(100)); 
		
	}
}
