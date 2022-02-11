package com.bridgelab.day5functionalprograms;

import java.util.Scanner;

public class SumOfThreeIntAddsToZero {
	// Prints all triplets in arr[] with 0 sum
	static void findTriplets(int[] arr, int n)
	{
		boolean found = false;
		for (int i=0; i<n-2; i++)
		{
			for (int j=i+1; j<n-1; j++)
			{
				for (int k=j+1; k<n; k++)
				{
					if (arr[i]+arr[j]+arr[k] == 0)
					{

						System.out.println("Triplets whose sum is equal to zero are : "+arr[i]+" "+arr[j]+" "+arr[k]);
						found = true;
					}
				}
			}
		}

		// If triplet with 0 sum not found in array
		if (found == false)
			System.out.println(" Triplets not exist ");

	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Array Elements  ");
		// taking input into array
		for(int i=0;i<5;i++)
		{ 
			arr[i]=sc.nextInt();
		}

		System.out.println("Elements of array ");

		//printing array elements
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");   
		}

		System.out.println();

		// n =arr.length, to take length array as a user input 
		findTriplets(arr, 5);
		sc.close();
	}

}
