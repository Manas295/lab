import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		/*
		 * Intermediate operations
		 filter(),map(), sorted(),
		 */
		memberNames.stream().filter((s) -> s.startsWith("A") ||  s.startsWith("B"))
		.forEach(System.out::println);

		System.out.println(":::::::::::::::::::::::::::");

		memberNames.stream().filter((s) -> s.startsWith("A"))
		.map(String::toUpperCase)
		.forEach(System.out::println);

		System.out.println(":::::::::::::::::::::::::::");

			memberNames.stream().sorted()
			.map(String::toUpperCase)
			.forEach(System.out::println);

		System.out.println(":::::::::::::::::::::::::::");

		/*
		 * Terminal operations
			forEach(), match(),count(), reduce()
		 */
		memberNames.forEach(System.out::println);

		System.out.println(":::::::::::::::::::::::::::");

		List<String> memNamesInUppercase = memberNames.stream().sorted()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(memNamesInUppercase);

		System.out.println(":::::::::::::::::::::::::::");

		boolean matchedResult = memberNames.stream()
				.anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream()
				.allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream()
				.noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);


		System.out.println(":::::::::::::::::::::::::::");

		long totalMatched = memberNames.stream()
				.filter((s) -> s.startsWith("A"))
				.count();

		System.out.println(totalMatched);


		System.out.println(":::::::::::::::::::::::::::");

		Optional<String> reduced = memberNames.stream()
				.reduce((s1,s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);

		System.out.println(":::::::::::::::::::::::::::");

	}

}
