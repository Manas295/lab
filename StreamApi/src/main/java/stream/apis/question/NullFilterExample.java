package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullFilterExample {
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Apple", null, "Banana", null, "Cherry", null);

		// Filter out null values using streams
		List<String> filteredList = stringList.stream()
				.filter(str -> str != null)
				.collect(Collectors.toList());

		// Print the filtered list
		System.out.println("Filtered list: " + filteredList);
	}
}
