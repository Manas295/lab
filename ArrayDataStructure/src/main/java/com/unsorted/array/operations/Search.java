package com.unsorted.array.operations;

public class Search {

	public static void main(String[] args) {
		int arr[] = {12, 34, 10, 6, 40};

		int size = arr.length;
		// Using a last element as search element
		int key = 40;
		int position = findElement(arr, size, key);
		System.out.println("Element "+key+" is found at index "+position+"");
	}

	public static int findElement(int[] arr, int size, int key) {
		for(int i=0;i<size;i++)
		{
			if(arr[i] == key)
				return i;

		}
		return -1;
	}
}
