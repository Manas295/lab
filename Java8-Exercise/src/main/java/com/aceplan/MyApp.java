package com.aceplan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyApp {
	public static void main(String[] args) {


		/*Q1 Write a program using streams to remove all odd numbers and then square the result 
		 * and print the sum of all squares.
		 * Change the code to not use the first 3 even numbers
		 */
		System.out.println("----------------Q1-----------------");
		System.out.println("Sum : "+IntStream.range(1,10).filter(i -> i%2!=0).skip(3).map(i-> i*i).reduce(0,Integer::sum));

		System.out.println("----------------------");

		/*Q2 Calculate average in an array list
		 * 
		 */
		System.out.println("----------------Q2-----------------");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		OptionalDouble average = list.stream().mapToInt(a->a).average();
		System.out.println("Average  :"+average.getAsDouble());
		System.out.println("----------------------");


		/*Q3 Create a Movie class which has ratings. From a Set of movies print the Top rated movies, average and the lowest rating movies. 
		 * 
		 */
		System.out.println("----------------Q3-----------------");
		List<Movie> movieList = Arrays.asList(new Movie("ABCD", 3, 2001), new Movie("XYZ", 4, 2005),
				new Movie("DEF", 5, 2019), new Movie("PQR", 4, 2002));

		IntSummaryStatistics summaryStatistics = movieList.stream().mapToInt(Movie::getRating).summaryStatistics();

		System.out.println("Max "+summaryStatistics.getMax());
		System.out.println("Min "+summaryStatistics.getMin());
		System.out.println("Average "+summaryStatistics.getAverage());

		IntSummaryStatistics summary_data = movieList.stream().mapToInt(a -> a.getRating()).summaryStatistics();

		movieList.stream().filter(a -> a.getRating() == summary_data.getMin()).forEach(System.out::println);

		movieList.stream().filter(a -> a.getRating() == summary_data.getMax()).forEach(System.out::println);
		//
		movieList.stream().filter(a -> a.getRating() == summary_data.getAverage()).forEach(System.out::println);
		System.out.println("----------------------");

		/*Q5 If I have list of movies with ratings and year of release. 
		 * I want to first sort them based on ratings and then year of release
		 * 
		 */
		System.out.println("----------------Q5-----------------");
		movieList.stream().sorted(Comparator.comparing(Movie::getRating).thenComparing(Comparator.comparing(Movie::getYear)))
		.forEach(System.out::println);
		System.out.println("----------------------");

		/*
		 * I have a Developer class. Each developer is can have multiple skills like Java, 
		 * Java script, database, .Net and so on. From a list of Developers find out the 
		 * unique skills available in the company
		 * 
		 */
		System.out.println("----------------Q6-----------------");

		List<Developer> devList = Arrays.asList(new Developer("alok", Arrays.asList("Java", ".Net", "JavaScript")),
				new Developer("manas", Arrays.asList("Java", "Database", "python")),
				new Developer("nikhil", Arrays.asList("Java", ".Net", "JavaScript")));

		devList.stream().flatMap(dev -> dev.getSkillsList().stream()).distinct().forEach(System.out::println);

		System.out.println("----------------------");

		/*
		 * Write a program to count the number of ‘e’ in a list. E.g "Ken", "Jeff", "Ellen" should print 4.
		 */

		System.out.println("----------------Q7-----------------");

		Stream<String[]> map = Arrays.asList("Ken","Jeff","Ellen").stream().map(a->a.toLowerCase().split(""));
		long count = map.flatMap(Arrays::stream)
				.filter(a -> a.equalsIgnoreCase("e")).count();
		System.out.println("Count  :"+count);

		/*
		 * I have a stream of strings and I want to collect them in  a 
		 * map with key as length and value as a Set of those words
		 */
		System.out.println("----------------Q8-----------------");

		HashMap<Integer, Set<String>> mapOfString = Arrays.asList("Ken","Jeff","Ellen").stream().collect(Collectors.groupingBy(String::length, HashMap::new,Collectors.toSet()));
		mapOfString.entrySet().stream().forEach(a -> System.out.println("key[" + a.getKey() + "],value[" + a.getValue() + "]"));

	}
}
