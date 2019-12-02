/**
 * Below Example Show Instance initializer Block , Static Block , Constructor
 * It shows in  which order  statement prints 
 * Instance Initializer Explanation :https://www.javatpoint.com/instance-initializer-block
 * Static block loads at time of class loading & constructor envoked after object creation
 */
public class MethodOverLoadingDemo {
	{
		System.out.println("One");
	}
	static {
		System.out.println("two");
	}
	public MethodOverLoadingDemo(){
		System.out.println("three");
	}
	
	public static void main(String args []) {
		//Second this will Execute
		System.out.println("four");
		MethodOverLoadingDemo methodOverLoadingDemo	= new MethodOverLoadingDemo();
		
	//z	methodOverLoadingDemo.m1(null);
		 
		methodOverLoadingDemo.m1("1");
		methodOverLoadingDemo.m1("1.1");
		methodOverLoadingDemo.m1(1);
		methodOverLoadingDemo.m1(1l);
		methodOverLoadingDemo.m1(1.1);
		methodOverLoadingDemo.m1(1.1f);
		methodOverLoadingDemo.m1(1.1d);
		
		methodOverLoadingDemo.m1(1234);
		methodOverLoadingDemo.m1("1234");
		
	}
	
	public void m1(Object o) {
		System.out.println("Object method called.");
	}
	public void m1(Integer o) {
		System.out.println("Integer method called.");
	}
	
	public void m1(String s) {
		System.out.println("String mehtod called.");
	}
	
	public void m1(Float f) {
		System.out.println("Float method called.");
	}
	
	public void m1(Double i) {
		System.out.println("Double method called.");
	}
	
	public void m1(Long i) {
		System.out.println("Long method called.");
	}
}
