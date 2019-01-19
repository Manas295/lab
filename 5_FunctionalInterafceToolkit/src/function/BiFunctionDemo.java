package function;

import java.util.function.BiFunction;


//Represents a function that accepts two arguments and produces a result.
public class BiFunctionDemo {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:"
				+ num1 + num2;
		System.out.println(biFunction.apply(20, 25));
	}
}
