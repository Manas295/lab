import java.util.ArrayList;
import java.util.List;

public class SplitCust {

	public static void main(String[] args) throws Exception{
		String str = "ABC#DEF#CFG";
		StringBuilder strbuild = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='#')
			{
				System.out.println(strbuild.toString());
				strbuild.setLength(0);
				
			}
			else
			{
				strbuild.append(str.charAt(i));
	
			}
		}
		System.out.println(strbuild.toString());
		
	}
	

}
