package impl1;

import interfaces.I1;


class I1Impl implements  I1{

		@Override
		public void m1() {
		   System.out.println("this is from I1");			
		} 
	}



public class I1ImplTest {

	public static void main(String[] args) { 
		I1 ref = new I1Impl();
		ref.m1();

	}
  }	

 
