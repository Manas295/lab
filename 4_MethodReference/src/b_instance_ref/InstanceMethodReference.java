package b_instance_ref;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InstanceMethodReference {	
	
	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Amit",40));
		people.add(new Person("Manoj",30));
		people.add(new Person("Joy",62));
		people.add(new Person("Herry",67));		
		
		Collections.sort(people, (p1,p2)  -> p1.getAge()  - p2.getAge());
		
		Collections.sort(people, (p1,p2)->new Comp().compareAges(p1, p2));

    	// Method reference
        Collections.sort(people, new Comp()::compareNames);  
		
	 	people.forEach(p -> System.out.println(p.getName()));
	 	  
				
	   }
	 
} // end main class

class  Comp{	
	public int compareAges(Person p1,Person p2){
		return p1.getAge() - p2.getAge();
	}
	
	public int compareNames(Person p1,Person p2){
			String age1 = p1.getName();
			return age1.compareTo(p2.getName());
	}
}
