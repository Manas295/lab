package impl1;

	@FunctionalInterface
	interface Calculator{
	  int calculate(int x, int y);
	}
public class Exmaple2 {
	 private static void engine(Calculator calculator){
		    int x = 4, y = 2;
		    int result = calculator.calculate(x,y);
		    System.out.println(result);
		  }
	 
	 
	public static void main(String[] argv) {
//		Calculator cc= (x,y)-> x + y;
//	    engine(cc);
	    engine((x,y)-> x + y);
	    engine((x,y)-> x * y);
	    engine((x,y)-> x / y);
	    engine((x,y)-> x % y);
	  }
	 
	}

 
