package operation.interm;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoreIntermediateOperations {
	public static void main(String[] args) throws InterruptedException {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		/**
		 * filter()
		 * Filter accepts a predicate to filter all elements of the stream.
		 * This operation is intermediate which enables us to call another stream operation
		 * (e.g. forEach) on the result.
		 */

		memberNames.stream().filter((s) -> s.startsWith("A"))
		.forEach(System.out::println);
		System.out.println();
		
		/**map()
		The intermediate operation map converts each element into another object via 
		the given function.
		The following example converts each string into an upper-cased string.
		But you can also use map to transform each object into another type.
		 */
		memberNames.stream().filter((s) -> s.startsWith("A"))
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		/**
		 * sorted()
		 * Sorted is an intermediate operation which returns a sorted view of the stream. 
		 * The elements are sorted in natural order unless you pass a custom Comparator.

		 */
		System.out.println("....SORTED...");
		memberNames.stream().sorted()
		.map(String::toUpperCase)
		.forEach(System.out::println); 
		
		
		/**
		 * Keep in mind that sorted does only create a sorted view of the stream without
		 *  manipulating the ordering of the backed collection. 
		 *  The ordering of memberNames is untouched
		 */

		//flatMap
		/**
		 * The flatMap transforms each element of a stream into another form (just like map), 
		 * and generates sub streams of the newly formed elements. 
		 * Finally, it flattens all of the sub streams into a single stream of elements.
		 * As the flatMap is a map type of function, it also takes a function and applies
		 * (maps) that function to each of the element in the stream. 
		 * 
		 * The difference between map and flatMap is, the map accepts a function
		 * that returns a mapped element and then the map function returns a stream of 
		 * such elements. On the other hand, the flatMap accepts a function that returns 
		 * streams of the mapped elements and then the flatMap finally returns a 
		 * collective stream of all of the sub streams that are created by the each 
		 * execution of the passed function. Let's have a look at the below example,
		 * which clearly shows how the flatMap works and also also shows the difference
		 * between the map and flatMap when passed a similar function.
 
         * We did almost the similar operation with the flatMap, 
		   with the only difference that the function passed to the flatMap returns a stream.
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		List<List<Integer>> mapped = 
		                     numbers.stream()
		                     .map(number -> Arrays.asList(number -1, number, number +1))
		                     .collect(Collectors.toList());
		System.out.println(mapped); //:> [[0, 1, 2], [1, 2, 3], [2, 3, 4], [3, 4, 5]]
		        
		List<Integer> flattened = 
		                numbers.stream()
		                .flatMap(number -> Arrays.asList(number -1, number, number +1).stream())
		                .collect(Collectors.toList());
		System.out.println(flattened);  //:> [0, 1, 2, 1, 2, 3, 2, 3, 4, 3, 4, 5]
		 
	}
}
 