package c_InstanceMethodArbitrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstanceMethodArbitraryObject {

	public static void main(String[] args) { 
				
			String e1 = new String("A");   
			String e2 = new String("E");
			String e3 = new String("B");    
			String e4 = new String("C");    
			List<String> list = new ArrayList<String>();   
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
			
			Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
			
			Collections.sort(list, String::compareTo);
			
			System.out.println(list);
			 
	}

}
