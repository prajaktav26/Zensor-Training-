package com.Task_Based;

import java.util.Arrays;

public class SumLessThanSecHighest {
	static int secondHighest(int arr[],int arr_size)
	{
		int i,first,second;
		if(arr_size<2)
		{
			System.out.println("Invalid input");
		}
Arrays.sort(arr);
for(i=arr_size-2;i>=0;i--)
{
	if(arr[i]!=arr[arr_size-1])
	{
		System.out.println();
	}
	
}
	}

	public static void main(String[] args) {
		int arr[]= {12,34,56,78,90};
		int n=arr.length;
		

}
}