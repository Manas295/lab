package com.arrays.practice;

public class MissingNumInArray {
	
	public static void main(String[] args) {
		int[] arr1={7,5,6,1,4,2};
		System.out.println("Missing Num "+missingNumber(arr1));
		
	}
	public static int missingNumber(int[] arr)
	{
		int n = arr.length+1; // as 1 number is missing
		int sumOfNElements = n*(n+1)/2;
		int sumOfArr = 0;
		for(int i=0;i<arr.length;i++) {
			sumOfArr+=arr[i];
		}
		
		int missingNum = sumOfNElements-sumOfArr;
		return missingNum;
	}
}
