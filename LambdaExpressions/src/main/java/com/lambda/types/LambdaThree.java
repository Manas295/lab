package com.lambda.types;



public class LambdaThree {

	public static void main(String[] args) {
		GenLambda<String> rev = (str) -> { 
			
			String res = "";
			for(int i=str.length()-1;i>=0;i--)
				res = res+str.charAt(i);
			return res;
		};
		System.out.println(rev.comp("Raj"));
		
		
		GenLambda<Integer> noOfDig = (Integer i) -> {
			int res = 0;
			if(i>10)
				while(i>0)
				{
					
					res++;
					i=i/10;
				}
			else 
				return 1+res;
			return res;
			
		};
		System.out.println(noOfDig.comp(new Integer("123363")));
	}
}

interface GenLambda<T>
{
	T comp(T t);
}