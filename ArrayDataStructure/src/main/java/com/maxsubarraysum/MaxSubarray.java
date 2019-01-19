package com.maxsubarraysum;

public class MaxSubarray {
	public static void main(String[] args) {
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Maximum contiguous sum is " +
				maxSubArraySum(a));
	}
	public static int maxSubArraySum(int arr[])
	{
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		System.out.println(max_so_far);
		int size = arr.length;

		for(int i=0 ; i < size ; i++)
		{
			max_ending_here = max_ending_here + arr[i];
			System.out.println("max_ending_here is " +max_ending_here);
			System.out.println("max_so_far is "+max_so_far);
			if(max_so_far < max_ending_here) 
				max_so_far = max_ending_here;
			if(max_ending_here < 0)
				max_ending_here = 0;

		}
		return max_so_far;
	}
}
