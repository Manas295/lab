package com.repetitive.element;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RepetitiveElement {

    public static void main(String[] args) {

        
        Integer arr[] = new Integer[]{ 9, 8, 2, 6, 1, 8, 5, 3, 4, 7,8 ,8,8,1,7,7 };
        calculateRepetitiveEmelentWithCount(arr);
        
        /*HashSet<Integer> obj = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(obj.contains(arr[i]))
            {
                System.out.println("Element which is repetitive is "+arr[i]);
                return;
            }
            obj.add(arr[i]);
        }*/
    }

    public static void calculateRepetitiveEmelentWithCount(Integer[] arr){
        HashMap<Integer,Integer> hm    = new HashMap<Integer,Integer>();
        Arrays.sort(arr);
        int count;

        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] == arr[i+1]) {
                count  = hm.get(arr[i])==null?1:hm.get(arr[i]);
                count  = count +1;
                hm.put(arr[i],count);
            }
        }
        System.out.println(hm);
    }

}
