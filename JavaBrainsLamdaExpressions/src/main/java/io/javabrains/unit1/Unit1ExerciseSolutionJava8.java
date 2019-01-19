package io.javabrains.unit1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Manas","Bansal",25),
				new Person("Piyush","Nautiyal",23),
				new Person("Bakul","Kant",22),
				new Person("Preeti","Gupta",26),
				new Person("Ankur","Goyal",28)
				);
		//Step1 :: Sort List by last name

		Collections.sort(people,(p1, p2) ->  p1.getLastName().compareTo(p2.getLastName()));


		//Step2 :: Create Method that prints all elements in list
		printConditionally(people, p ->true);


		//Step3 :: Create a method that prints all people that have last name begining with C or Any other filter
		System.out.println("------> Printing all people whose lastName startswith G");
		printConditionally(people,p->p.getLastName().startsWith("G") );
		System.out.println("------> Printing all people whose firstName startswith P");
		printConditionally(people,p->p.getFirstName().startsWith("P") );
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p :people) {
			if(condition.test(p)) {
				System.out.println(p);
			}		
		}

	}
}
