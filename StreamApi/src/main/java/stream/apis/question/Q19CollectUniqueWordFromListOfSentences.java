package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q19CollectUniqueWordFromListOfSentences {
	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
				"Java 8 introduced streams",
				"Streams are powerful",
				"Use streams to process data"
				);

		Set<String> uniqueWords = sentences.stream()
		.map(sentence->sentence.split("\\s+"))//by whitespace i.e splitting into words
		.flatMap(Arrays::stream)
		.map(String :: toLowerCase)
		.collect(Collectors.toSet());
		
		System.out.println(uniqueWords);
	}
}
