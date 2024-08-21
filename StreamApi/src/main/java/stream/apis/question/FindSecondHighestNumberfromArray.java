package stream.apis.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindSecondHighestNumberfromArray {

	public static void main(String[] args) {
		int[] numbers = {5, 3, 9, 1, 6, 8, 9};  // Example array with duplicate highest value
		Optional<Integer> secondHighest = Arrays.stream(numbers).boxed() //convert array to stream
				.distinct()  // Remove duplicates
				.sorted(Comparator.reverseOrder()) //sort in ascending order
				.skip(1) //skips to the second last element in sorted stream 
				//which is second highest number
				.findFirst();

		if (secondHighest.isPresent()) {
			System.out.println("Second highest number is: " + secondHighest.get());
		} else {
			System.out.println("Array does not have enough unique elements.");
		}
	}
}
