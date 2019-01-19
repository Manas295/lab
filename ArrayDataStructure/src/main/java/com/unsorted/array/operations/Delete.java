package com.unsorted.array.operations;

public class Delete {

	// function to search a key to 
	// be deleted
	static int findElement(int arr[], int n, int key)
	{
		int i;
		for (i = 0; i < n; i++)
			if (arr[i] == key)
				return i;

		return -1;
	} 

	// Function to delete an element
	static int deleteElement(int arr[], int n, int key)
	{
		// Find position of element to be 
		// deleted
		int pos = findElement(arr, n, key);

		if (pos == -1)
		{
			System.out.println("Element not found");
			return n;
		}

		// Deleting element
		int i;
		for (i = pos; i< n - 1; i++)
			arr[i] = arr[i + 1];

		return n - 1;
	}

	// Driver Code
	public static void main(String args[])
	{
		int i;
		int arr[] = {10, 50, 30, 40, 20};

		int n = arr.length;
		int key = 30;

		System.out.println("Array before deletion length "+arr.length);
		for (i=0; i<n; i++)
			System.out.print(arr[i] + " ");

		n = deleteElement(arr, n, key);

		System.out.println("\n\nArray after deletion length "+arr.length);
		for (i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	} 

}
