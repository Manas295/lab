package com.gfg.Arrays;

public class CheckArrayIsSortedOrNot {
	public static void main(String[] args) {
		int arr[] = {5,10,18,21}; 
		System.out.println("Result of given array is sorted or not is :- "+isSorted(arr));
	}

	static boolean isSorted(int arr[]) {
		int len = arr.length;
		//int i = 0;
		int j = len-1;
		for(int i =1;i<len;i++) {//here we started from index 1 because we need to check i-1 val
			// if we do i+1 instead of i-1 then in last iteration we will end having 
			//ArrayOutOfbound Exception
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
