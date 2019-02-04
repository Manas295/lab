package io.javabrains.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.unit1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Manas","Bansal",25),
				new Person("Piyush","Nautiyal",23),
				new Person("Bakul","Kant",22),
				new Person("Preeti","Gupta",26),
				new Person("Ankur","Goyal",28)
				);

		performConditionally(people, p ->true,System.out :: println);  //p ->method(p) Method reference as System.out is instance & println is methos of that instance
	}

	/**	USING PREDICATE INTERFACE IN THIS CASE JAVA PROVIDES SOME INTERFACE TO SOLVE OUR COMMON PROBLEMS															
	 * java.util.functions
	 * ***/	
	//USING CONSUMER INTERFACE IN ORDER TO DECIDE BEHAVIOUR OF THE OUTPUT IN OUR CASE WE WANT TO PRINT
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p :people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}		
		}
	}
}
