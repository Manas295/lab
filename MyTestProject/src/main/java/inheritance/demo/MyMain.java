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
		System.out.println("Super Constructor "+a);
	}
	
	public void display() {
		a= 8;
		System.out.println(a);
	}
	{
		System.out.println("Super Instance Block "+a);
	}
}

class ChildClass extends SuperClass{

	//int a = 3;
	{
		System.out.println("Child Instance Block "+a);
	}
	
	static{
		System.out.println("static block in child");
	}
	
	public ChildClass(){
		a = 1;
		System.out.println("Child Constructor "+a);
	}
	
	public void display() {
		int a	= 10;
		System.out.println(a);
	}
}

