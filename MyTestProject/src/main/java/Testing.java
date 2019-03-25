
public class Testing {
	public static void main(String[] args) {
		char c[] = {'a','1','b',' ','A','0'};
		for(int i=0;i<5;++i)
		{
			if(Character.isDigit(c[i]))
				System.out.println(c[i]+ " is digit");
			if(Character.isWhitespace(c[i]))
				System.out.println(c[i]+ " is whitespace");
			if(Character.isUpperCase(c[i]))
				System.out.println(c[i]+ " is upper");
			if(Character.isLowerCase(c[i]))
				System.out.println(c[i]+ " is lower");

			i=i+3;

		}

		char ch ;
		ch = "hello".charAt(1);
		System.out.println(ch);

		String obj = "I"+ "Like"+ "Java";
		System.out.println(obj);

		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}

		Double d= new Double(1/0.);
		boolean x = d.isNaN();
		System.out.println(x);

		/*compile time error
		 * System.out.println(fun());



	}
	static int fun(int x=0)
	{
		return x;
	}
		 */
	
		String str="hello i love java";
		System.out.println(str.indexOf('i')+" "+str.indexOf('o')+" "+str.lastIndexOf('i')+" "+str.lastIndexOf('o') );
	}
}
