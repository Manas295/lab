package consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 { 
	
	/*
	@FunctionalInterface
	public interface Consumer<T>
	{
		void accept(T t);
	}
	*/
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Santosh");
		list.add("Ajit");
		list.add("Neha");
		list.add("Kavita"); 	
		Collections.sort(list); 
	 
		
		//Traverse with Lambda  "forEach method added in java 8 that takes Consumer "
		list.forEach(str -> System.out.println(str));		
		list.forEach(System.out::println);   // method ref
		
		
		// only for >5
		list.forEach(str -> 
		                 { 
		                	 if(str.length() >5) 
		                		 System.out.println(str); 
		                 }
		            ); 	
		
		 
}
	
}

