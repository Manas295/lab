package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q26MergeLists {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
		List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
				//Above concat operation creates a single stream by concatenating 
				//the stream of list1 and list2
				.distinct()
				.collect(Collectors.toList());
		System.out.println(mergedList);
	}

}
