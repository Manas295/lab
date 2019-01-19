
public class PolymorphismDemo{
	public static void main(String[] args) {
		BaseClass baseClass	= new DerivedClass();
		baseClass.method();
	}
}


class BaseClass{
	
	public BaseClass() {
		method();
	}
	
	public void method() {
		System.out.println("Base class method is called");
	}
}

class DerivedClass extends BaseClass{
	String s	= null;
	
	DerivedClass(){
		s="Piyush";
	}
	
	public void method() {
		System.out.println("Child class method is called. length of s is  ["+s.length()+"]");
	}
}
