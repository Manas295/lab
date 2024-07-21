package stream.apis.question;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharactersInString {
	public static void main(String[] args) {
		String input = "aaabbccc";
        //keyMapper a mapping function to produce 
		//keysvalueMapper a mapping function to produce values
		//mergeFunction a merge function, used to resolve collisions between values associated with the same key,
		//as supplied to Map.merge(Object, Object, BiFunction)
		Map<Character, Long> frquencyMap = input.chars().mapToObj(c -> (char)c)
		.collect(Collectors.toMap(Function.identity(), c->1L, Long :: sum));
		
		frquencyMap.forEach((character,frequency)->System.out.println(character + "=" + frequency));
	
		
		Map<Character, Long> frquencyMap1 = input.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		frquencyMap1.forEach((character,frequency)->System.out.println(character + "-->" + frequency));

	}
}
