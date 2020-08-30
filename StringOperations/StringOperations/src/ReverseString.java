
public class ReverseString {
	
	public static void main(String[] args) {
		
		String str= "My Name Is Manas Bansal";
		String reverse ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse= reverse+str.charAt(i);
		}
		
		System.out.println(reverse);
		
		int start =0;
		int end = str.length()-1;
		int mid = (end-start)/2;
		char []str1 = str.toCharArray();
		String finalStr = "";
		for(int j=0 ; j<mid;j++) {
			
			char ch = str1[j];
			str1[j] = str1[end];
			str1[end] = ch;
			end--;
		}
		
		for(char ch : str1) {
			finalStr+=ch;
		}
		System.out.println(finalStr);
	}

}
