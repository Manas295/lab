package com.largestelement;

import java.util.Arrays;
import java.util.Collections;

public class KlargestElements {

	public static void main(String[] args) {
		
		Integer arr[] = new Integer[]{1, 23, 12, 9,30, 2, 50};
		int k=3;
		Klargest(arr,k);
	}
	static void Klargest(Integer arr[],int k)
	{
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i =0;i<k;i++)
		{
			System.out.println(i+1+" Largest Number is "+arr[i]);
		}
	}
}
