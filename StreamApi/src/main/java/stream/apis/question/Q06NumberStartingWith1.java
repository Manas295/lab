package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q06NumberStartingWith1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(123, 456, 101, 789, 120, 132, 204);
		List<String> listWithNumStartingWith1 = numbers.stream()
		.map(num->String.valueOf(num)).filter(str->str.startsWith("1"))
		.collect(Collectors.toList());
		System.out.println(listWithNumStartingWith1);

	}
}
