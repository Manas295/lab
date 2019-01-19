package com.customexception.checked;

public class MyExceptionMain {
	public static void main(String[] args) {

// Here we need to handle it as its a checked exception
		try{checkString("manas");}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	public static void checkString(String s) throws MyCustomCheckedException{


		if("".equals(s))
		{
			throw new MyCustomCheckedException("String is null");
		}
		else
		{
			System.out.println("String is "+s);
		}

	}
}
