package com.hashmapsort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import  java.util.stream.Collectors;



public class HashMapSorting {

	public static void main(String[] args) {
        Map<String,String> langMap = new HashMap<String,String>();
        langMap.put("ENG", "English");
        langMap.put("NLD", "Dutch");
        langMap.put("ZHO", "Chinese");
        langMap.put("BEN", "Bengali");
        langMap.put("ZUL", "Zulu");
        System.out.println("-- Original Map --");
        for(Map.Entry lang : langMap.entrySet()) {
            System.out.println("Key- " + lang.getKey() + 
                          " Value- " + lang.getValue());
        }
        Map<String,String> newMap = langMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k,v)->k,LinkedHashMap::new));
     

        Map<String,String> newMap1 = langMap.entrySet().stream().sorted(HashMapSorting::comparingByValue)
        								.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(k,v)->k,LinkedHashMap::new));

        System.out.println("-- Sorted Map --");
        newMap1.entrySet().forEach((e)->{System.out.println("Key- " + e.getKey() + " Value- " + e.getValue());});
    }

	private static int comparingByValue(Map.Entry<String, String> entry1, Map.Entry<String, String> entry2) {
		return entry2.getValue().compareTo(entry1.getValue());
	}
}