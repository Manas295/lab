package com.lambda.types;



public class LambdaSix {

	public static void main(String[] args) {
		String s = "sss";
		AssignVariable as = (str) -> {
			return null+s+str;
		};
		System.out.println(as.isJoined("Helloo"));
	//	s = "qqq";
	}
}

interface AssignVariable
{
	
	public String isJoined(String str);
}