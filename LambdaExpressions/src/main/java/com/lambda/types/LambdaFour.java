package com.lambda.types;


public class LambdaFour {

	public static void main(String[] args) {
		RevStrLambda rev = (str) -> {
			
			String res="";
			for(int i=str.length()-1;i>=0;i--)
				res =  res+str.charAt(i);
			
			return res;
		};
		
		System.out.println(revLambFunc(rev , "Raj"));
	}
	
	public  static String revLambFunc(RevStrLambda reve, String str)
	{
		return reve.rev(str);
	}
}


interface RevStrLambda
{
	String rev(String str);
}