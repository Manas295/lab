package com.test.unmodifiableCollectionDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableCollectionDemo {

	public static void main(String[] args) {
		Map<String, String> hm	= new HashMap<String,String>();
		
		hm.put("Key", "value");
		
		Map<String,String> unmodifiableMapObject	= Collections.unmodifiableMap(hm);
		
		unmodifiableMapObject.put("key2","value2");
		
		
		
	}
}
