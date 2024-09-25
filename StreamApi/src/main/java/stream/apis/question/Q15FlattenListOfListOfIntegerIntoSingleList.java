package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSInput;

public class Q15FlattenListOfListOfIntegerIntoSingleList {
	public static void main(String[] args) {
		List<List<Integer>> listOfLists = Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9)
				);
		List<Integer> flattenList = listOfLists.stream()
		//using flatmap here will flatten each list into a single stream of integers
		.flatMap(list -> list.stream())//or List :: stream
		.collect(Collectors.toList());
		System.out.println(flattenList);
	}
}
