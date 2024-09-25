package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q02SumOfOddEvenNumbersInList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//partitionBy used to partition the elements of a stream into 
		//two groups based on a given predicate
		Map<Boolean, Integer> sums = numbers.stream().collect(Collectors.partitioningBy(num-> num%2==0, 
				Collectors.summingInt(Integer::intValue)));//num->num
		int evenSum = sums.get(true);
		int oddSum = sums.get(false);
		System.out.println("Sum of even numbers: " + evenSum);

		System.out.println("Sum of odd numbers: " + oddSum);
	}
}
