package com.arrays.practice;

public class FindSmallestAndLargest {

	public static void main(String[] args) {
		int[] arr={7,5,6,1,4,2};
		
		int smallest = arr[0];
		int largest  = arr[1];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
			if(arr[i]> largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("Largest "+largest+" Smallest "+smallest);
		
	}

}
