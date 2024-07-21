package stream.apis.question;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "iindiiia";

		/**
		 *  
		 *  Initially an IntStream is created with input.chars(). where each integer value represent a character in string
		 *  mapToObj converts each integer back to its corresponding char
		 *  Function.identity() returns the input as output. i.e. x -> x. So, it returns the Character object in the stream itself.
		 *  Collectors.groupingBy(…) stores Character objects as a key & count of each character as a value. LinkedHasMap is used to main the order.
		 *  
		 */
		LinkedHashMap<Character, Long> charactersMap = str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

		String res = charactersMap.entrySet().stream()
				.filter(entry -> entry.getValue()==1).findFirst().get().getKey().toString();
//		charactersMap.entrySet().stream()
//				.forEach(entry ->{
//					System.out.println(entry.getKey() +" "+entry.getValue());
//				});

		System.out.println(res);
	}
}
