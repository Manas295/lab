package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.unit1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Manas","Bansal",25),
				new Person("Piyush","Nautiyal",23),
				new Person("Bakul","Kant",22),
				new Person("Preeti","Gupta",26),
				new Person("Ankur","Goyal",28)
				); 
		
		System.out.println("Using for loop");
		
		for(int i=0;i<people.size();i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for each loop");
		
		for(Person p : people)
		{
			System.out.println(p);
		}
		
		System.out.println("Using Lambda for each Loop");
		//people.forEach(p->System.out.println(p));
		people.forEach(System.out::println);
	}

}
