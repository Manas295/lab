package function;

import java.util.function.Function;

//Represents a function that accepts one argument and produces a result.

/*
  The primary purpose for which Function<T, R> has been created is for mapping scenarios 
  i.e when an object of a type is taken as input and its is converted(or mapped) to another type.  
  in Function<T, R> ,an object of type T is input to the lambda and an object of type R is obtained as return.   
 */

/*
  @FunctionalInterface
  public interface Function<T, R> {
   R apply(T t);
  }
*/

public class FunctionsDemo {

	public static void main(String[] args) {
		
		Function<Integer, String> toString = String::valueOf;
		String s=toString.apply(123);
		
		Function<String, Integer> toInteger = Integer::valueOf;
		int i=toInteger.apply("1237");
		
		Function<String, String> toIntThenHexa = toInteger.andThen(Integer::toHexString); 
		String output = toIntThenHexa.apply("12334567");    
		System.out.println(output);
		
		
		Function <Integer ,Integer > f1 = FunctionsDemo::change;    //return a*2;
		Function <Integer ,Integer > f2 = FunctionsDemo::changeAgain;   //return a+2;
		Function <Integer ,Integer > f3 = f1.andThen(f2); 
		
		//Returns a composed function that first applies this function to its input, 		                                                                          
		//and then applies the after function to the result.
		
		int a= f1.apply(12);
		System.out.println(a);
		
		int a1=f2.apply(12);
		System.out.println(a1);
		
		int a2=f3.apply(12);
		System.out.println(a2);
		
		
		//Compose and andThen
		Function<Integer, Integer> times2 = e -> e * 2;
		Function<Integer, Integer> squared = e -> e * e;	
		
		int data = times2.andThen(squared).apply(4);
		
		int data2 =times2.compose(squared).apply(4);
		
		 System.out.println(data +" "+data2);
	}
	
	static int change(int a)
	{
		return a*2;
	}
	static int changeAgain(int a)
	{
		return a+2;
	}
}
