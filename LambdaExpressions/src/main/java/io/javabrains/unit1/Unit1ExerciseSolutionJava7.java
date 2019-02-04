package io.javabrains.unit1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Unit1ExerciseSolutionJava7{

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Manas","Bansal",25),
				new Person("Piyush","Nautiyal",23),
				new Person("Bakul","Kant",22),
				new Person("Preeti","Gupta",26),
				new Person("Ankur","Goyal",28)
				);
		//Step1 :: Sort List by last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});


		//Step2 :: Create Method that prints all elements in list
		printAll(people);


		//Step3 :: Create a method that prints all people that have last name begining with C or Any other filter
		//printLastNameBeiginningWithC(people);
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("G");
			}


		});

	}

	private static void printLastNameBeiginningWithC(List<Person> people) {
		for(Person p :people) {
			if(p.getLastName().startsWith("ss")) {
				System.out.println(p);
			}		
		}
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p :people) {
			if(condition.test(p)) {
				System.out.println(p);
			}		
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p :people) {
			System.out.println(p);
		}
	}
	
}
interface Condition{
	boolean test(Person p);
}
