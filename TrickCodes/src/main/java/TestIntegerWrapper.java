
public class TestIntegerWrapper {

int a =10;
static int b =9;
	
	public static void main(String args[])
	{
//		Integer a=null;
//		int b=a;
//		System.out.println("value of b:"+b);
		
		TestIntegerWrapper s1 = new  TestIntegerWrapper();
		TestIntegerWrapper s2 = new  TestIntegerWrapper();
		s1.a=90;
		s2.a=30;
		s1.b = 88;
		s2.b = 99;
		
		System.out.println(s1.a);
		System.out.println(s2.a);
		System.out.println(s1.b);
		System.out.println(s2.b);
		System.out.println(b);
	}
}

