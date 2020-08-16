package com.string.ds;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		String resultStr = getUniqueCharacterSubstring("AABCDDEF");
		System.out.println(resultStr);
	}
	public static String getUniqueCharacterSubstring(String input) {
	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	            System.out.println("O/P "+output);
	        }
	        System.out.println("Start "+start+" End "+end);
	        visited.put(currChar, end);
	    }
	    System.out.println("Map "+visited);
	    return output;
	}
}
