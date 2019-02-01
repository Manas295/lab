package inheritance.demo;

public class MyMain {

	public static void main(String args[]) {
		SuperClass superClass	= new ChildClass();
		superClass.display();
	}
}

class SuperClass{
	int a = 5;
	
	public SuperClass() {
		a= 11;
	}
	
	public void display() {
		a= 8;
		System.out.println(a);
	}

}

class ChildClass extends SuperClass{

	//int a = 3;
	
	{
		System.out.println(a);
	}
	
	
	public ChildClass(){
		a = 1;
		System.out.println(a);
	}
	
	public void display() {
		int a	= 10;
		System.out.println(a);
	}
}

