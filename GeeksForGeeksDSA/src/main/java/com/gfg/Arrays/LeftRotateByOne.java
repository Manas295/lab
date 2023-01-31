package com.gfg.Arrays;

public class LeftRotateByOne {

	public static void main(String[] args) {
		int arr[] = {30,5,20};//{1,2,3,4,5};
		int d = arr[0];
		int n = arr.length;
		for(int i=1;i<n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = d;
		
		System.out.print("[ ");
		for(int i=0 ; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}

}
