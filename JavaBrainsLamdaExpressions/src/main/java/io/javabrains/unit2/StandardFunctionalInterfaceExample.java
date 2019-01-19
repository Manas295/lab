package io.javabrains.unit2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.unit1.Person;


public class StandardFunctionalInterfaceExample {

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
		performConditionally(people, p ->true,p->System.out.println(p));


		//Step3 :: Create a method that prints all people that have last name begining with C or Any other filter
		System.out.println("------> Printing all people whose lastName startswith G");
		performConditionally(people,p->p.getLastName().startsWith("G"),p->System.out.println(p) );
		System.out.println("------> Printing all people whose firstName startswith P");
		performConditionally(people,p->p.getFirstName().startsWith("P"),p->System.out.println(p.getFirstName()) );
	}

	//private static void printConditionally(List<Person> people, Condition condition) {

	/**	USING PREDICATE INTERFACE IN THIS CASE JAVA PROVIDES SOME INTERFACE TO SOLVE OUR COMMON PROBLEMS															
	 * java.util.functions
	 * ***/
	/*private static void performConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p :people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}		
		}

	}*/
	
	//USING CONSUMER INTERFACE IN ORDER TO DECIDE BEHAVIOUR OF THE OUTPUT IN OUR CASE WE WANT TO PRINT
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p :people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}		
		}

	}
}
