/*
 * LINK https://www.journaldev.com/2774/java-8-stream
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {

		//Java Stream of integers from a group of int or Integer objects.
		Stream<Integer> stream = Stream.of(1,2,3,4);
		System.out.println(stream.collect(Collectors.toList()));

		//Using Stream.generate() or Stream.iterate() functions -->  infinite 
		/*	Stream<String> stream1 = Stream.generate(() -> {return "abc";});
		stream1.forEach(p -> System.out.println(p));

		Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
		stream2.forEach(p -> System.out.println(p));*/
		
		//Using Arrays.stream() and String.chars() methods.
		LongStream is = Arrays.stream(new long[]{1,2,3,4});
		is.forEach(p ->System.out.println(p));
		
		IntStream is2 = "abc".chars();
		is2.forEach(p ->System.out.println(p));

		//java Stream collect() method to get List, Map or Set from stream.
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println(intList); //prints [1, 2, 3, 4]
		
		//We can use stream toArray() method to create an array from the stream.
		Stream<Integer> intStream1 = Stream.of(1,2,3,4);
		Integer[] intArray = intStream1.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]


		

	}

}
