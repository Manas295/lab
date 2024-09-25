package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Concatenate a list of strings into a single string, separated by commas, using streams ?
public class Q08ConcatListOfStringIntoASingleString {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Apple","Banana","Cherry","Date");
		/**
		 * Collectors.joining - collects the element of stream i nto a single string
		 * with each element separated by comma
		 */
		String result = strings.stream().collect(Collectors.joining(","));
		System.out.println("String : "+result);
		
	}
}
