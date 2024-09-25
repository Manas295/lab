package stream.apis.question;

import java.util.Arrays;
import java.util.List;

public class Q27CheckStringStartsWithSpecificPrefix {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
		String prefix = "ba";
		boolean startsWithPrefix = strings.stream()
				.anyMatch(s -> s.startsWith(prefix));
		System.out.println("Any string starts with prefix: " + startsWithPrefix);
	}
}
