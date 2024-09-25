package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q21PartitionListIntoEvenAndOddNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,45);
		Map<Boolean, List<Integer>> mapOfEvenAndOdd = numbers.stream().collect(Collectors.partitioningBy(num -> num%2==0));
		System.out.println("Even : "+mapOfEvenAndOdd.get(true));
		System.out.println("Odd : "+mapOfEvenAndOdd.get(false));
		
		Map<Boolean, Long> countOfEvenAndOdd = numbers.stream().collect(Collectors.partitioningBy(num -> num%2==0,Collectors.counting()));
		System.out.println("Even : "+countOfEvenAndOdd.get(true));
		System.out.println("Odd : "+countOfEvenAndOdd.get(false));
	}
}
