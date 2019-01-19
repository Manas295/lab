package com.largestelement;

public class LargestElement {

	public static void main(String[] args) {

		int arr[]= {12,90,32,20,-1,99,78,11,1,2,4,77,54};
		int size = arr.length;
		int largest = findLargest(arr,size);
		System.out.println("Largest Elemnt "+largest);
	}
	static int findLargest(int arr[],int size)
	{
		int MAX = arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>MAX)
			{
				MAX = arr[i];
			}
		}
		return MAX;
	}
}
