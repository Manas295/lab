package com.lambda.types;


public class LambdaOne {

	public static void main(String[] args) {
		NumberPrime even = (n) -> (n%2)==0;
		NumberPrime odd = (n) -> (n%2)!=0;
		System.out.println(even.isPrime(11));
	}
}

@FunctionalInterface
interface NumberPrime
{
	public boolean isPrime(int n);
}

/*
 * NOTE::
 * 
 *1. The body of a lambda expression can contain zero, one or more statements
 *2. When there is a single statement curly brackets are not mandatory and 
 *   the return type of the anonymous function is the same as that of the body expression.
 *3. When there are more than one statements, then these must be enclosed in curly brackets.
 *   and we have to write return statement if that method is returning some value.
 * 
 */
