
public class Type2OccurrenceChar {
	public static void main(String[] args) {

		String a = "aabbaaccbbeerr";

		System.out.println("Length "+a.length());
		char[] arr = a.toCharArray();
		
		for(int i=0 ; i<arr.length ; i++) {
			int count=1;
			while(i<arr.length-1 && a.charAt(i)==a.charAt(i+1))
			{
				
				count++;
				i++;
			}
			
			System.out.print(a.charAt(i));
			System.out.print(count);
		}

	}
}
