package consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import model.Student;

/*
@FunctionalInterface
public interface Consumer<T>
{
	void accept(T t);
}
*/

public class Consumer2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Ram", 20));
		list.add(new Student("Shyam", 22));
		list.add(new Student("Kabir", 18));
		  
		// Creating instance of Consumer functional interface
		
		Consumer<Student> style = (s) -> System.out.println("Name:"	+ s.name + " and Age:" + s.age);
				 
		//list.forEach(style);	
	 
		
		Consumer<Student> name=(s2)->System.out.println(s2.name);
		//list.forEach(name);
		Consumer<Student> age =(s3)->System.out.println(s3.age);
		//list.forEach(age);
		
		Consumer <Student> combine =name.andThen(age);		
		
		list.forEach(combine);
		
	}
} 
