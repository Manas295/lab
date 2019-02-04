package com.lambda.types;



public class LambdaSeven {

	public static void main(String[] args) {
		ReCompute<String> reStr = (str) -> {
			String rev="";
			for(int i= str.length()-1;i>=0;i--)
				rev = rev+ str.charAt(i);
			return rev;
		};
		
		
		ReCompute<Integer> reInt = (x) -> {
			
			int temp=0;
			while(x>0)
			{	
				temp = temp*10+(x%10);
				x = x/10;
			}
			return temp;
		};
		
		System.out.println(lambdaFuncParam(reStr, "KAMINA"));
		System.out.println(lambdaFuncParamInt(reInt, 1213));
	}
	
	
	public static String lambdaFuncParam( ReCompute<String> s, String val)
	{
		return s.comp(val);
	}
	public static Integer lambdaFuncParamInt( ReCompute<Integer> s, int x)
	{
		return s.comp(x);
	}
}

interface ReCompute<T>
{
	
	T comp(T t);
}