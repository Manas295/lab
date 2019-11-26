package com.hashmapsort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {
	public static void main(String[] args) {
		
		   Map<String,String> langMap = new HashMap<String,String>();
	        langMap.put("ENG", "English");
	        langMap.put("NLD", "Dutch");
	        langMap.put("ZHO", "Chinese");
	        langMap.put("BEN", "Bengali");
	        langMap.put("ZUL", "Zulu");

	        System.out.println("Original Map "+langMap);
	        
	        Map<String, String> map = langMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
	        	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (K,V)->K+","+V));
	        //,LinkedHashMap::new));
	        System.out.println("Map "+map);
	       map.entrySet().forEach((e)->{System.out.println("Key- " + e.getKey() + " Value- " + e.getValue());});
	       
	       Map newMap= langMap.entrySet().stream().sorted()
                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k,v)->k,LinkedHashMap::new));		
	}

}
