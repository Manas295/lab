package com.java.util.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Driver class
class Main
{
	public static void main(String[] args)
	{
		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		// Sort by rating : (1) Create an object of ratingCompare
		//                  (2) Call Collections.sort
		//                  (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		// Collections.sort(list, ratingCompare);
		Collections.sort(list,Comparator.comparing(Movie::getRating));
		for (Movie movie: list)
			System.out.println(movie.getRating() + " " +
					movie.getName() + " " +
					movie.getYear());


		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
	//	Collections.sort(list, nameCompare);
		/*
		 * Collections.sort(list, (Movie m1, Movie m2) -> { return
		 * m1.getName().compareTo(m2.getName()); });
		 */
		Collections.sort(list, Comparator.comparing(Movie::getName));
		for (Movie movie: list)
			System.out.println(movie.getName() + " " +
					movie.getRating() + " " +
					movie.getYear());

		/*
		 * MORE REFERENCE : https://medium.com/@coffeeandtips.tech/using-comparator-comparing-to-sort-java-stream-a6e0302dce1a
		 * https://medium.com/@ganesh.shah/comparator-vs-comparable-java-8-940a83f53bd3
		 */

	}
}  