
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("----------------Q1-----------------");
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 6, 8, 10);

		Integer sum = list.stream().filter(a -> a % 2 == 0).skip(3).mapToInt(a -> a * a).sum();

		System.out.println(sum);
		
		System.out.println("-----------------Q2----------------");
		
		OptionalDouble avg = list.stream().mapToInt(a -> a).average();

		System.out.println(avg.getAsDouble());
		
		System.out.println("------------------Q3---------------");
		
		List<Movie> movieList = Arrays.asList(new Movie("ABCD", 3, 2001), new Movie("XYZ", 4, 2005),
				new Movie("DEF", 5, 2019), new Movie("PQR", 4, 2002));

		IntSummaryStatistics summary_data = movieList.stream().mapToInt(a -> a.getRating()).summaryStatistics();

		movieList.stream().filter(a -> a.getRating() == summary_data.getMin()).forEach(System.out::println);

		movieList.stream().filter(a -> a.getRating() == summary_data.getMax()).forEach(System.out::println);

		movieList.stream().filter(a -> a.getRating() == summary_data.getAverage()).forEach(System.out::println);

		// movieList.stream().sorted((Movie m1,Movie m2) ->
		// m1.getRating()-m2.getRating());

		System.out.println("------------------Q5---------------");

		List<Movie> sortedList = movieList.stream()
				.sorted(Comparator.comparing(Movie::getRating).thenComparing(Movie::getYear))
				.collect(Collectors.toList());

		sortedList.forEach(System.out::println);

		System.out.println("---------------------------------");

		List<String> stringList = Arrays.asList("alok", "Manas");

		Map<Integer, String> map = stringList.stream().map(a -> a)
				.collect(Collectors.toMap(a -> a.toString().length(), a -> a.toString()));

		map.entrySet().stream().forEach(a -> System.out.println("key[" + a.getKey() + "],value[" + a.getValue() + "]"));

		System.out.println("---------------Q6------------------");

		List<Developer> devList = Arrays.asList(new Developer("alok", Arrays.asList("Java", ".Net", "JavaScript")),
				new Developer("manas", Arrays.asList("Java", "Database", "python")),
				new Developer("nikhil", Arrays.asList("Java", ".Net", "JavaScript")));
		
		devList.stream().flatMap(a -> a.getSkillsList().stream()).distinct().forEach(System.out::println);
		
		System.out.println("----------------Q7-----------------");
		
		List<String> stringList2	= Arrays.asList("Ken","Jeff","Ellen","alok","manas");
		
		long count = stringList2.stream().map(c ->c.toLowerCase().split("")).flatMap(Arrays::stream).filter(a -> a.equalsIgnoreCase("e")).count();
		
		System.out.println("count of char 'e' in string array is ["+count+"]");
		
		System.out.println("-----------------Q8----------------");
		
		Map<Integer,Set<String>> mapOfString = stringList2.stream().collect(Collectors.groupingBy(String::length,HashMap::new,Collectors.toSet()));
		
		mapOfString.entrySet().stream().forEach(a -> System.out.println("key[" + a.getKey() + "],value[" + a.getValue() + "]"));
		
		System.out.println("-----------------Q9----------------");
		
		Map<Boolean,List<String>> mapOfString2 = stringList2.stream().collect(Collectors.partitioningBy( a -> a.toString().length() > 4));
		
		mapOfString2.entrySet().stream().forEach(a -> System.out.println("key[" + a.getKey() + "],value[" + a.getValue() + "]"));
		
		System.out.println("-----------------Q12----------------");
			
		List<Apple> listOfApple = Arrays.asList(new Apple(1,200),new Apple(2, 100),new Apple(3, 180));
		
		Predicate<Apple> upperpredicate = a -> a.getWeight() < 250;
		
		Predicate<Apple> lowerpredicate = a -> a.getWeight() > 150;
		
		listOfApple.stream().filter(upperpredicate.and(lowerpredicate)).forEach(System.out::println);
		
		System.out.println("-----------------Q13----------------");
		
		stringList2.stream().forEach((a) -> printNames(() -> a));
		
		System.out.println("-----------------Q15----------------");
		
		Function<String, String> function = (e) -> e.toUpperCase();
		
		stringList2.stream().map(function).forEach(System.out::println);
	}
	
	private static void printNames(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

}