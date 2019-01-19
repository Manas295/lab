package test.comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
		
	public static void main(String[] args) {		
		
		List<String> list = new ArrayList<>();
		list.add("******");
		list.add("**");
		list.add("*****");
		list.add("***");
		list.add("*"); 
		list.add("****");
		list.add("***********");
		
		for(String s:list){
			System.out.println(s);
		}
		
		System.out.println("----------------------");
		
 // 1st 
		/*Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}			
		};	
		
		Collections.sort(list, comp);
		for(String s:list){
			System.out.println(s);
		}*/
		
 // 2nd 
		/*Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {

				return Integer.compare(s1.length(), s2.length());
			}
		});
		for(String s:list){
			System.out.println(s);
		}*/
		
		
 // 3rd
		
	 // Comparator<String> comp = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
	   
	  //Comparator<String> comp = (s1,s2) -> Integer.compare(s1.length(), s2.length()); // type infer
	  
      // with mutiple lines {} and 'return' required  					
        
      Comparator<String> comp = (s1,s2) -> {
					 				  System.out.println("Need to use return if more than one line");
					 				  return  Integer.compare(s1.length(), s2.length());
		  };
		  
		Collections.sort(list, comp); 
		for(String s:list){
			System.out.println(s);
		}	
		     				 
		   
		// can pass the lambda to sort directly			            				 
		  /* Collections.sort(list,(s1,s2) ->{
		                                  System.out.println("welcome");
					          	          return  Integer.compare(s1.length(), s2.length());
					          		     }
					      );
		     for(String s:list){
			      System.out.println(s);
		    }
		  */		            				 
		
		
	}

}
