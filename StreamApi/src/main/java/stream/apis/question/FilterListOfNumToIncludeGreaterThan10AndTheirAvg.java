package stream.apis.question;

import java.util.Arrays;
import java.util.List;

public class FilterListOfNumToIncludeGreaterThan10AndTheirAvg {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
		//mapToInt -> Converts the Stream<Integer> to an Instream because Instream has a method average that 
		//calculates avergae of elements directlty
		//Calculates the average of Nums in Instream . This returns an OptionalDouble which
		//might not have a value if teh stream is empty
		double average = numbers.stream().filter(num ->num>10)
		.mapToInt(num -> num)// mapToInt is sufficient here
		.average()//Calculate average directly
		.orElse(0);//Default value if list is empty
		
        System.out.println("Average of numbers greater than 10: " + average);
	}

}
