import java.util.ArrayList;

public class NumReverse {

	public static void main(String[] args) {
		int a =123;
		int i;
		int reverse	= 0;
		while(a>0)
		{
			i=a%10;
			reverse	= reverse * 10 + i;
			a=a/10;
		}
		System.out.println("reverse is "+ reverse);
	}
	
}