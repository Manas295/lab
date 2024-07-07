package stream.apis.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OldestPerson {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Vikram",45),
				new Person("Batra",87),
				new Person("Kailash",32),
				new Person("Sunil",88),
				new Person("Vikash",65));
		String name = personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).findFirst()
		.get().getName();
		System.out.println(name);
	}
}
