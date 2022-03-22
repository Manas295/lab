package com.arrays.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] numArray = {2, 6, 7, 6, 2, 19, 1, 19};
		ArrayList<Integer> duplicateArrElements = new ArrayList<Integer>();
	    Set<Integer> numSet = new HashSet<Integer>();
	    for(int num : numArray){
	      // If add returns false
	      if(!numSet.add(num)){
	        System.out.println("Duplicate element found " + num);
	        duplicateArrElements.add(num);
	      }
	    }
	}

}
