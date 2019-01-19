package com.customexception.unchecked;

public class MyExceptionMain {
	public static void main(String[] args) {

		// Here we have not handled any exception as its a unchecked One
		checkString("manas");
	}

	public static void checkString(String s) throws MyCustomUnCheckedException{


		if("".equals(s))
		{
			throw new MyCustomUnCheckedException("String is null");
		}
		else
		{
			System.out.println("String is "+s);
		}

	}
}
