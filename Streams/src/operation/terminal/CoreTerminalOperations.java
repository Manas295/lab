package operation.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import first.Dish;

public class CoreTerminalOperations {

	public static void main(String[] args) {
	    List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		//TERMINAL OPERATIONS
		//Terminal operations return a result of a certain type instead of again a Stream.
		 
		 /* forEach()
		This method helps in iterating over all elements of a stream and perform some 
		operation on each of them. 
		The operation is passed as lambda expression parameter.
		  */
		
		memberNames.forEach(System.out::println); 

		   
		   /**
		   * collect()
		   * collect() method used to recieve elements from a stream 
		   * and store them in a collection
		   * as mentioned in parameter function.
		   */
		List<String> memNamesInUppercase = memberNames.stream().sorted()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.print(memNamesInUppercase); 
		    
		    /**
		    * match()
		    * Various matching operations can be used to check whether a certain 
		    * predicate matches the stream. All of those operations are terminal and return 
		    * a boolean result.
		    * (sort circuit)
		    */
		
		boolean matchedResultAnyMatch = memberNames.stream()
				.anyMatch((s) -> s.startsWith("A"));

		System.out.println("\n matchedResultAnyMatch "+matchedResultAnyMatch);

		boolean matchedResultAllMatch = memberNames.stream()
				.allMatch((s) -> s.startsWith("A"));

		System.out.println("matchedResultAllMatch  "+matchedResultAllMatch);

		boolean matchedResultNoneMatch = memberNames.stream()
				.noneMatch((s) -> s.startsWith("A"));

		System.out.println("matchedResultNoneMatch "+matchedResultNoneMatch ); 
		     
		     
		     /**
		     *  count()
		     *  Count is a terminal operation returning the number of elements in the 
		     *  stream as a long.
		     */
		
		long totalMatched = memberNames.stream()
									   .filter((s) -> s.startsWith("A"))
									   .count();

		System.out.println("totalMatched "+totalMatched); 
		

		/* SUM  */
		List<Person> people = new ArrayList<>();		
		people.add(new Person("Joe", 48));
		people.add(new Person("Aary", 30));
		people.add(new Person("Mike", 73)); 	 
		
		 int sumAges = people.stream()
				 			 .mapToInt(p -> p.getAge())
				 			 .sum();
		System.out.println("Total of ages: " + sumAges);
	 
		  /**
	      *  reduce()
	      *  This terminal operation performs a reduction on the elements of the
	      *  stream with the given function. 
	      *  The result is an Optional holding the reduced value.
	      *  
	      *  often called a fold operation
	      */		      
		List<Integer> numbers =Arrays.asList(12,34,12,34); 
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		int product1 = numbers.stream().reduce(1, (a, b) -> a * b); 
		int max = numbers.stream().reduce(1, Integer::max);
        System.out.println("sum ="+sum +" ,Product1= "+product1+  " ,max= "+max);
		    
		
        
        /* Optional  */
        List<Integer> numbers2 =Arrays.asList(12,45); 
        int sum2 = numbers2.stream().reduce(0, (a, b) -> a + b);
		int prod1 = numbers2.stream().reduce(1, (a, b) -> a * b); 
		int prod2 = numbers2.stream().reduce(0, Integer::max);
        System.out.println("sum ="+sum2 +" ,Product1 "+prod1+  "  ,Max2  "+prod2);
       
        
        Optional<Integer> O_sum2 = numbers2.stream().reduce((a, b) -> a + b);
        Optional<Integer> O_prod1 = numbers2.stream().reduce((a, b) -> a * b); 
        Optional<Integer> O_prod2 = numbers2.stream().reduce(Integer::max);
        System.out.println("o_sum ="+O_sum2 +" ,O_Product1 "+O_prod1+  "  ,O_Max2  "+O_prod2);
         
                 
        if(O_sum2.isPresent()) 
        	System.out.println(O_sum2);
        else
        	System.out.println("not found");
        
        O_sum2.ifPresent(p -> System.out.println(O_sum2));  
        
        //Finding (findAny , findFirst)
       /* findAny
        Returns an Optional describing some element of the stream, 
        or an empty Optional if the stream is empty.
        */ 
        
        Optional<Dish> dish = Dish.menu.stream().parallel()
        		                       .filter(Dish::isVegetarian)
        		                       .findAny();  
        dish.ifPresent(d ->System.out.println(d.getCalories()));
        
        
        /*
        findFirst
         Returns an Optional describing the first element of this 
         stream, or an empty Optional if the stream is empty.    
        */
        
        Optional<Dish> dish2 = Dish.menu.stream().parallel()
        							.filter(Dish::isVegetarian) 
        							.findFirst();  
        dish2.ifPresent(d ->System.out.println(d.getCalories()));
        
        /*
          In parallel processing when the collections data will be distributed on
          the multiple threads..  findAny() will exit as soon as any matching 
          data is found in any thread.. 
          
          Where as the findFirst() operation will wait to get the filtered data 
          from all the threads and then apply findFirst() operation on the return data set

         */
        
	}
}
