package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q03FindDuplicateElementsInList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 4);
		 List<Integer> duplicatesInList = numbers.stream().collect(Collectors.groupingBy(Function.identity()
				, Collectors.counting())).entrySet()
		.stream().filter(entry->entry.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		System.out.println(duplicatesInList);
	}
}
