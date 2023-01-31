package com.gfg.Arrays;

public class LeftRotateByDPlaces {

	//Assuming D<= no of elements in array
	public static void main(String[] args) {
		int arr[] = {10,5,30,15};//{1,2,3,4,5};
		//leftRotateByD(arr);
		leftRotateByReversalAlgo(arr,3);
	}

	static void leftRotateOne(int arr[], int n ) {
		int temp = arr[0];
		for(int j = 1;j<n;j++) {
			arr[j-1] = arr[j];
		}
		arr[n-1] = temp;
	}
	//TC: O(nd)
	//SC: O(1)
	static void leftRotateByD(int arr[]) {
		int d = 3;
		int n = arr.length;
		for(int i=0;i<d;i++) {
			leftRotateOne(arr, n);
		}
		
		System.out.print("[ ");
		for(int i=0 ; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
	
	//TC:O(n)
	//SC:O(1)
	static void leftRotateByReversalAlgo(int arr[], int d) {
		int n = arr.length;
		reverse(arr,0,d);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		System.out.print("[ ");
		for(int i=0 ; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
	
	static void reverse(int arr[], int low, int high) {
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
}
