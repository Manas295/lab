
public class StringReplaceChar {

	public static void main(String[] args) {
		String inputString = "Shreya";
		char[] strArray = inputString.toCharArray();
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i] == 'a') {
				strArray[i] = 't';
			}
		}
		System.out.println(strArray);
	}

}
