package com.gfg.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = {10,5,7,30,11};
		int j = arr.length-1;
		int temp =0;
		for(int i=0 ; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i]  = arr[j];
			arr[j] = temp;
			j--;
		}
		System.out.print("[");
		for(int ele : arr)
		System.out.print(ele+",");
		System.out.println("]");
		
		//Using While Loop
		reverseArray();
	}
	
	static void reverseArray() {
		int arr[] = {10,5,7,30,11};
		int low =0;
		int high = arr.length-1;
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		System.out.print("[");
		for(int ele : arr)
		System.out.print(ele+",");
		System.out.println("]");
	}
}
