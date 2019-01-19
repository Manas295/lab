import java.util.HashMap;

public class StringOccurrence {
	public static void main(String[] args) {
		char c = 'A';
		String str = "ORGANIZATION";

		checkCharOccurrence(str, c);
		checkOccurrenceMethod2(str);

	}

	public static void checkOccurrenceMethod1(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			int count=0;

			if(str.charAt(i)!=' ')
			{
				String val = str.charAt(i)+"";
				for(int j=0;j<str.length();j++)
				{
					if(val.equals(str.charAt(j)+""))
					{
						count+=1;
					}


				}
				if(count>0)
					str = str.replace(str.charAt(i), ' ');

				System.out.println("CHARACTER "+val+" Count "+count);
			}


		}
	}
	public static void checkCharOccurrence(String str,char c)
	{
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void checkOccurrenceMethod2(String inputString)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		//Converting given string to char array

		char[] strArray = inputString.toCharArray();

		//checking each char of strArray

		for (char c : strArray)
		{
			if(charCountMap.containsKey(c))
			{
				//If char is present in charCountMap, incrementing it's count by 1

				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				//If char is not present in charCountMap,
				//putting this char to charCountMap with 1 as it's value

				charCountMap.put(c, 1);
			}
		}

		//Printing the charCountMap

		System.out.println(charCountMap);
	}
}
