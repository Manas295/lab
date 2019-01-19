package predicate;

import java.util.Objects;
import java.util.function.Predicate;

import model.Person;

/*
@FunctionalInterface
public interface Predicate<T>
 {
    boolean	test(T t); //Evaluates this predicate on the given argument.
 }
*/
public class PredicateNagateAndOr {
	
	public static void main(String[] args) {
		
		Predicate<String> predicate = (s) -> s.length() > 0;

		predicate.test("Hello");              // true
		predicate.negate().test("welcome");     // false

	 
		
		Predicate<Boolean> isNull = Objects::isNull;		
		Predicate<String> isEmpty = String::isEmpty;		
		Predicate<String> isNotEmpty = isEmpty.negate();
		
		
		// chaining Predicate
		Predicate<String> predicate1 = (s1) -> s1.length() > 5;
		Predicate<String> predicate2 = (s2) -> s2.length() < 10;
		Predicate<String> predicate3 = predicate1.and(predicate2);
		System.out.println(predicate3.test("abcdxggfdqwe"));
		 
		
		
		
		
		
		
		
	}

}
