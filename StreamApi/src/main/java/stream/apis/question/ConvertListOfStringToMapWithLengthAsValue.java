package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListOfStringToMapWithLengthAsValue {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		Map<String, Integer> strLengMap = strings.stream()
		.collect(Collectors.toMap(Function.identity(), String::length));
		
		strLengMap
		.forEach((k,v)->System.out.println(k+" - "+v));

	}
}
