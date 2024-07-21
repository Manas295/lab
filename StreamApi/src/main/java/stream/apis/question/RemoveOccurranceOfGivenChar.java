package stream.apis.question;

import java.util.stream.Collectors;

public class RemoveOccurranceOfGivenChar {
	public static void main(String[] args) {
		String str = "java interview";
        char ch = 'a';
        
        String resStr = str.chars().filter(c->c!=ch)
        .mapToObj(c->String.valueOf((char)c))
        .collect(Collectors.joining());
        System.out.println(resStr);
	}
}
