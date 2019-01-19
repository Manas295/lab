package LambdaWithMultipleParam;

public class LambdaExample3 {
	public static void main(String[] args) {
		
		Operations op1 = (int a,int b) -> (a+b);
		System.out.println("ADDITION IS  "+op1.add(3, 5));
		Operations op2 = ( a, b) -> (a+b);
		System.out.println("ADDITION IS  "+op2.add(2, 1));
	}

}
