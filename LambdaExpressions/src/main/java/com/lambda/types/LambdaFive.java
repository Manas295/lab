package com.lambda.types;


public class LambdaFive {

	public static void main(String[] args) {
		MyCompare c = (a,b) -> {
			return a>b;
		};
		System.out.println(c.comp(10, 20));
		
		System.out.println(compareLambdaVar(c,20,10));;
	}
	
	public static boolean compareLambdaVar(MyCompare cc, int a, int b)
	{
		return cc.comp(a, b);
	}
}
 interface MyCompare
 {
	 boolean comp(int a, int b);
 }