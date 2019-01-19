package HashMapTest;

import java.util.HashMap;

public class MainClass {
	public static void main(String args[]) {
		KeyClass k1	= new KeyClass("one");
		KeyClass k2	= new KeyClass("Two");
		KeyClass k3	= new KeyClass("Three");
		KeyClass k4	= new KeyClass("Four");
		
		HashMap hm	= new HashMap();
		
		hm.put(k1, "value 1");
		hm.put(k2,"value 2");
		hm.put(k3,"Value 4");
		hm.put(null,"value 3");
	
		System.out.println(hm.get(k1));
		System.out.println(hm.get(k2));
		System.out.println(hm.get(null));
		System.out.println(hm.get(k4));
		System.out.println(hm.get(""));
		System.out.println("Keys "+hm.keySet());
		System.out.println("Values "+hm.entrySet());
	}
}
