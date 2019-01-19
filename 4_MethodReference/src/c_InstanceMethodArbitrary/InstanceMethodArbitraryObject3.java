package c_InstanceMethodArbitrary;

 
import java.util.ArrayList;

import java.util.List;

public class InstanceMethodArbitraryObject3 {

	public static void main(String[] args) {


		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Amit",40));
		people.add(new Person("Manoj",30));
		people.add(new Person("Joy",62));
		people.add(new Person("herry",67));
		
		
		people.forEach(p -> p.showDetails());	
		
		people.forEach(Person::showDetails);
		
		
	}

}
