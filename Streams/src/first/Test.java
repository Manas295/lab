package first;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<Dish> dishes =Dish.menu;
		
		// 
		
		Stream<String> st = 
				dishes.stream()
								  .filter(d -> d.getCalories() > 400) //sop
								  .sorted(Comparator.comparing(Dish::getCalories))
								  .map(Dish::getName);	
								  //.forEach(System.out::println);								  
								  //.collect(Collectors.toList());
		
		st.forEach(System.out::println);
		st.collect(Collectors.toList());
		
		//st.forEach(System.out::println);
		
		
		//dishes.stream().forEach(System.out::println);
		
//		List l2 = dishes.stream().collect(Collectors.toList());
//		l2.forEach(System.out::println);
		 
		//System.out.println(gf);
	}

}
