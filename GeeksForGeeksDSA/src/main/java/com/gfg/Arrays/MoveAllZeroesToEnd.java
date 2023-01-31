package com.gfg.Arrays;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int arr[] = {0,0,0,10,0,0,20};//{8,5,0,10,0,20};//{10,20};//{0,0,0,10,0}
		//arrangeTheArraySolution1(arr);
		arrangeArraySol2(arr);
	}

	//TC : O(n)
	//SC : O(1)
	static void arrangeTheArraySolution1(int arr[]) {
		int pointer = 1;
		int lastNonZeroAdd = -1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] !=0) {
				lastNonZeroAdd = i;
			}
			if(arr[i] == 0 && arr[pointer]!=0) {
				lastNonZeroAdd++;
				arr[lastNonZeroAdd] = arr[pointer];
				arr[pointer] = 0;
			}
			pointer++;
		}
		System.out.print("[ ");
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
	
	//TC: O(n)
	//SC : O(1)
	static void arrangeArraySol2(int arr[]) {
		int count =0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;//this pointer is having index at which next non zero value will be placed after swapping
			}
		}
		System.out.print("[ ");
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");

		
	}
}
