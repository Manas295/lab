package function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import model.Person;

public class FunctionDemo3 {

	public static void main(String[] args) {

		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Albert", 80));
		persons.add(new Person("Ben", 17));
		persons.add(new Person("Charlote", 20));
		persons.add(new Person("Dean", 6));
		persons.add(new Person("Elaine", 17));
		persons.add(new Person("Zino", 17));
		persons.add(new Person("Martin", 17));
		
		Function<Person,Integer> f1 = p->p.getAge();        
		Function<Person,String> f2 = p->p.getName();	
		
		//Function<Person,String> f3 = Person::getName; 
		
		Comparator<Person> comPersonAge = Comparator.comparing(f1);    //keyExtractor 
		Comparator<Person> comPersonName = Comparator.comparing(f2);		
		
		//Can also be written like below
       //Comparator<Person> comPerson1 = Comparator.comparing(p->p.getAge()); 
		//Comparator<Person> comPerson2 = Comparator.comparing(Person::getAge); 
		
		//sequence of comparator
		Comparator<Person> comPersoneAgeThenName=comPersonAge.thenComparing(comPersonName);
		
		
		Collections.sort(persons, comPersoneAgeThenName);		
		
		persons.forEach(System.out::println);
		//persons.forEach(p->System.out.println(p.getName()));
		
		
		
	}

}
