package stream.apis.question;

import java.util.stream.Collectors;

public class FindSpecialCharacterInString {
	public static void main(String[] args) {
		String input = "Hello, World! 123 #Java$Stream";
		
		String resStr = input.chars().filter(c->!Character.isLetterOrDigit(c))
		.mapToObj(c->String.valueOf((char)c))
		.collect(Collectors.joining(" "));
		System.out.println(resStr);
	}
}
