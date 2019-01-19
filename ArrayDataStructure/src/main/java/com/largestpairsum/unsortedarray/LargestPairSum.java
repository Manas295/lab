package com.largestpairsum.unsortedarray;

public class LargestPairSum {

	static int arr[] = new int[]{12, 34, 15,34,6, 40};
	
	static int findLargestSumPair()
	{
		int first,second;
		if(arr[0] > arr[1])
		{
			first = arr[0];
			second = arr[1];
		}
		else 
		{
			first = arr[1];
			second = arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i] > first)
			{
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second )//&& arr[i]!=first)
			{
				second = arr[i];
			}
			System.out.println("First is ["+first+"] second ["+second+"]");
		}
		System.out.println("First is ["+first+"] second ["+second+"]");
		return first + second; 
	}
	public static void main(String[] args) {
		System.out.println("Max Pair Sum is " + findLargestSumPair());

	}

}
