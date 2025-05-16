package stream.apis.question;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q04RemoveOccurranceOfGivenChar {
	public static void main(String[] args) {
		String str = "java interview";
        char ch = 'a';
        
        String resStr = str.chars().filter(c->c!=ch)
        .mapToObj(c->String.valueOf((char)c))
        .collect(Collectors.joining());
        System.out.println(resStr);
        
        
        //------------To remove duplicates from Char array which is primitive
		char [] arr =  {'a', 'b', 'c', 'a', 'm', 'n','p', 'k', 'l', 'p'};
		Stream<Character> mapToObj = IntStream.range(0, arr.length).mapToObj(i-> arr[i]);
		mapToObj.distinct().forEach(System.out::println);
	}
}
