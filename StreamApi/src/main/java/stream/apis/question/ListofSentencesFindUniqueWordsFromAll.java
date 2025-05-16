package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListofSentencesFindUniqueWordsFromAll {
	public static void main(String[] args) {
		/*
		  When we use map, it would create a stream of arrays of words. 
		  flatMap flattens these arrays of words into a single stream of words, 
		  which allows us to handle all the words uniformly.		 
		 */

		List<String> sentences = Arrays.asList(
				"The quick brown fox jumps over the lazy dog",
				"Never jump over the lazy dog quickly",
				"A quick movement of the enemy will jeopardize six gunboats");

		Set<String> uniqueWords = sentences.stream()
				.flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
				.map(String::toLowerCase) // Optional: To handle case sensitivity
				.collect(Collectors.toSet());

		System.out.println("Unique words: " + uniqueWords);
	}
}
