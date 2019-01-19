package LambdaWithSingleParam;

public class LambdaExample2 {
	public static void main(String[] args) {

		Drawing  d1	=(name)->{
			return "Shape of Drawing  "+name;
		};
		System.out.println(d1.shape("Circle"));

		Drawing  d2	=(name)->{
			return "Shape of Drawing  "+name;
		};
		System.out.println(d1.shape("Rectangle"));


	}
}
