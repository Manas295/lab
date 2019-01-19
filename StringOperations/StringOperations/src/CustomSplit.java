import java.util.ArrayList;
import java.util.List;

public class CustomSplit {
	public static void main(String[] args) {

		String str="ABC####BCD##DEF##ffff";
		String delimiter ="##";
		int start=0;
		int end=0;
		List<String> list = new ArrayList<String>(); 
		
		for(int i=str.indexOf(delimiter);i!=-1;i=str.indexOf(delimiter, i+1))
		{
			end=i;
			System.out.println("End "+end);
			list.add(str.substring(start,end));
			start=i+2;
			System.out.println("Start "+start);
		}
		
		list.add(str.substring(end+2));
		String words[] = (String[]) list.toArray(new String[list.size()]);
		for (String word : words) {
			System.out.println(word.trim());
		}
	}

}
