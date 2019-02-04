package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.unit1.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Manas","Bansal",25),
				new Person("Piyush","Nautiyal",23),
				new Person("Bakul","Kant",22),
				new Person("Preeti","Gupta",26),
				new Person("Ankur","Goyal",28)
				); 
		
		people.stream()
		.filter(p->p.getLastName().startsWith("G"))
		.forEach(p -> System.out.println(p.getFirstName()));
	}

}
