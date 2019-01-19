package io.javabrains.unit1;

//TYPE INFERENCE

public class TypeInferenceExample {

	public static void main(String[] args) {
	
		StringLengthLambda  stringLengthLambda = (String s)->s.length();
		//OR
		//StringLengthLambda  stringLengthLambda = (s)->s.length();
		//OR
		//StringLengthLambda  stringLengthLambda = s->s.length(); //This valid if only one arguement we take
		System.out.println(stringLengthLambda.getLength("Hello Lambda"));

		//SHOWING ANOTHE RWAY OF CALLING LAMDA
		
		printlambda(s->s.length());
		
	}

	
	public static void printlambda(StringLengthLambda s) {
		System.out.println(s.getLength("Hello Lambda"));
	}
	interface StringLengthLambda{
		int getLength(String s);
	}
}
