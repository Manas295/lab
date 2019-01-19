
public class RemoveDuplicate {
	public static void main(String[] args) {
		
		String str ="organization";
		char ch;
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			if(ch!=' ')
			{
				ans =  ans+ch;
			}
			str = str.replace(ch,' ');
		}
		System.out.println(ans);
		
	}

}
