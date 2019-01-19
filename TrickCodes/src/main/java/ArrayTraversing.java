
public class ArrayTraversing {

	static Integer x []	= {1,0,0,0,1,1,0,1,1};

	public static void main(String[] args) {

		printArray(x);
		Integer[] y	= operation(x);
		printArray(y);
		
	}

	public static void printArray(Integer[] x2) {
		for(int i=0;i<x2.length;i++) {
			System.out.print(x2[i] + ",");
		}
		System.out.println();
	}
	
	public static Integer[] operation(Integer k[]) {
		Integer newArray [] = new Integer[k.length];
		int zeroCount	= k.length -1;
		int oneCount	= 0;
		
		for(int i=0;i<k.length;i++) {
			if(k[i]==1) {
				newArray[oneCount]= k[i];
				oneCount ++;
			}else {
				newArray[zeroCount]= k[i];
				zeroCount -- ;
			}
		}
		return newArray;
	}
}
