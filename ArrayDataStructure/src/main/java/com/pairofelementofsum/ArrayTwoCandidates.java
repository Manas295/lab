package com.pairofelementofsum;

import java.util.Arrays;

public class ArrayTwoCandidates {


	public static void main(String[] args) {

		int A[]= {1, 4, 45, 6, 10, -8};
		int n = 16;
		int arr_size = A.length;
		hasArrayTwoCandidates(A, arr_size, n);
	}

	private static void hasArrayTwoCandidates(int[] a, int arr_size, int n) {
		int l,r;

		Arrays.sort(a);
		l=0;
		r=arr_size-1;

		while(l<r)
		{
			if(a[l]+a[r] ==n)
			{
				System.out.println("Array has two elements "+a[l]+", "+a[r]+" with given sum "+n+"");
				return;
			}
			else if(a[l]+a[r]<n)
				l++;
			else
				r--;
		}

		System.out.println("Array doesn't have " +
				"two elements with given sum");	
		return;
	}

}
