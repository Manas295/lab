package com.arrayrotation;

public class ArrayRotation {
	void printArray(int arr[], int size) 
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}
	public void leftRotate(int arr[],int d,int size)
	{
		for(int i=0;i<d;i++)
		{
			leftRotatebyOne(arr, size);
		}
	}
	public void leftRotatebyOne(int arr[],int n)
	{
		int i ,temp;
		temp = arr[0];
		for(i=0;i<n-1;i++)
			arr[i] = arr[i+1];
		arr[i] = temp;
	}
	
	
	public void rotateClockWise(int ar[],int rotationPointIndex) {
	    for(int i=0;i<ar.length;i++) {
	        rotationPointIndex   = (rotationPointIndex + 1) % ar.length;
	        System.out.print(ar[rotationPointIndex]+ " ");
	    }
	}
	
	public static void main(String[] args) 
	{
		ArrayRotation rotate = new ArrayRotation();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		rotate.rotateClockWise(arr, 2);
	/*	rotate.leftRotate(arr, 2, 7);
		rotate.printArray(arr, 7);
	*/	System.out.println();
		
	}



}

