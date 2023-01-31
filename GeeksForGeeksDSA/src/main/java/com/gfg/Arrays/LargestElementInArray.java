package com.gfg.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[] = {10,5,20,8};
		
		System.out.println("Index of largest element in array is : "+getLargest(arr));
		
		int arr1[] = {20,10,20,8,12}; //{10,10,10};
		System.out.println("Index of second largest element in array is : "+getSecondLargest(arr1));

	}
	
	static int getLargest(int arr[]) {
		int size = arr.length;
		int largest = 0;
		for(int i=1; i<size; i++) {
			if(arr[i]>arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}
	/**
	 * a[i] > a[largest] =: res = largest , largest = -1
	 * a[i] == a[largest] =: ignore
	 * a[i]<a[largest]
	 * 		1: res ==-1 then res = i
	 * 		2: a[i] <= a[res] : ignore
	 * 		3: a[i] > a[res] : res = i
	 */
	
	static int getSecondLargest(int arr[]) {
		int size = arr.length;
		int largest = 0;
		int res = -1;
		for(int i=1; i<size; i++) {
			if(arr[i]>arr[largest]) {
				res = largest;
				largest = i;
			}
			else if(arr[i]!=arr[largest]){ // In case duplicate value 
				if(res==-1 || arr[res]<arr[i]) {
					res = i;
				}
			}
		}
		return res;
	}
}
