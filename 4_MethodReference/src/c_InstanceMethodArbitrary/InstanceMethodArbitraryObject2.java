package c_InstanceMethodArbitrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InstanceMethodArbitraryObject2 {
	
	public static void main(String[] args) { 
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(8);
		list.add(1); 
		
     	 
		Collections.sort(list, (i1, i2) -> i1.compare(i1, i2));
		
		// using method reference 
		Collections.sort(list, Integer::compare);
		
		System.out.println(list);		
		
	}

}
