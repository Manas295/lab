package stream.apis.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestPerson {
	public static void main(String[] args) {
		  List<Person> people = Arrays.asList(
	                new Person("John", "Doe", 25),
	                new Person("Jane", "Smith", 30),
	                new Person("Alice", "Johnson", 28)
	        );
		String name = people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).findFirst()
		.get().getFirstName();
		System.out.println(name);
		
		Optional<Person> oldestPerson = people.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        String firstNameOfOldestPerson = oldestPerson.map(Person::getFirstName).orElse("No persons in the list");

        System.out.println("First name of the oldest person: " + firstNameOfOldestPerson);
	}
}
