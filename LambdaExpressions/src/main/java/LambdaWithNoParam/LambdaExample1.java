package LambdaWithNoParam;

public class LambdaExample1 {
	public static void main(String[] args) {

		int width = 10;
		Drawable d = () ->{
			//System.out.println("Drawing width "+width);
			return ("Drawing width "+width);
		};
		System.out.println(d.draw());
	}

}
