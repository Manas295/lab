package com.gfg.Arrays;

public class RemoveDuplicatesFromSortedArray {

	//Time Complexity will be O(n)
	//Space Complexity will be O(1)
	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,30,30};
		int res = 1; // pointer for keeping unique values in original array itself
		for(int i=1 ; i< arr.length ; i++) {
			if(arr[i]!=arr[res-1]) {  // here we are using res to check current index value with previous index
				arr[res] = arr[i];
				res++;//index at which last unique value is being inserted in current array only
			}
		}
		System.out.print("[ ");
		for(int i=0 ; i<res; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}

}
