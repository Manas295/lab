class A{
	int x=2;
	A(){
		System.out.println("Super Class Constructor : A");
		process(3);
	}
	void process(int i) {
		System.out.println("Inside Super class process method");
		x=x+i;
	}
}
class B extends A{
	B(){
		System.out.println("Base Class Constructor : B");
		process(4);
	}
	void process(int i){
		System.out.println("Inside base class process method");
		x=x*i;
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		A a =  new B();
		System.out.println(a.x);
	}
}
