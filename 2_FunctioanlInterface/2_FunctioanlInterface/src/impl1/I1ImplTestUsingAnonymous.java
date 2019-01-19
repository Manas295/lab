package impl1;

import interfaces.I1;

public class I1ImplTestUsingAnonymous {

	public static void main(String[] args) { 
		I1 ref = new I1() { 
			@Override
			public void m1() {

				System.out.println("this is from I1 using anonymous");
			}
		};
		
		ref.m1(); 
		
		}
	 
	
}
