package stream.apis.question;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

import java.util.stream.IntStream;


public class Q31RemoveConsecutiveDuplicateElementFromList {


    public static void main(String[] args) {

        var list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);

        List<Integer> l = removeConsecutiveDuplicates(list);

        System.out.println(l);

    }


    public static List<Integer> removeConsecutiveDuplicates(List<Integer> list) {

        return IntStream.range(0, list.size()-1) // Creates STream of indices from 0 to lis.size()

        	/*
        	 Filter out indices where the current element(list.get(i)) is same 
        	 as the previous element list.get(i-1) except for first element i==0
        	 which is always included	
        	 */
          .filter(i -> i == 0 || !list.get(i).equals(list.get(i - 1)))

          .mapToObj(list::get)

          .collect(Collectors.toCollection(ArrayList::new));

    }

}