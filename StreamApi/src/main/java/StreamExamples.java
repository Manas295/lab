import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
	public static void main(String[] args) {

		// Using Stream.of(val1, val2, val3….)
		/*	 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         stream.forEach(p -> System.out.println(p));*/

		// Using Stream.of(arrayOfElements)
		/*  Stream<Integer> streamobj = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         streamobj.forEach(p -> System.out.println(p));*/

		// Using someList.stream()
		/*	 List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         Stream<Integer> stream = list.stream();
         stream.forEach(p -> System.out.println(p));*/

		//Using Stream.generate() or Stream.iterate() functions     
		/*	 Stream<Date> stream = Stream.generate(() -> { return new Date();});
         stream.forEach(p -> System.out.println(p));*/

		//Convert Stream to List using stream.collect(Collectors.toList())
		/*		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i< 10; i++){
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
		 */
		//Convert Stream to array using stream.toArray(EntryType[]::new)
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i< 10; i++){
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		for (Integer integer : evenNumbersArr) {
			System.out.print(integer+",");	
		}

	}
}
