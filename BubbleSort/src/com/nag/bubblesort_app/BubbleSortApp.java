package com.nag.bubblesort_app;

import java.util.Scanner;

import com.nag.bubblesort.BubbleSort;

public class BubbleSortApp{

	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		
		int[] givenArray = takeInput();
		
		System.out.println("Given array");
		printArray(givenArray);
		
		BubbleSort bubbleSort = new BubbleSort();
		
		//To get decending order uncomment below code
//      bubbleSort.bubbleSortDescending(givenArray);
//		System.out.println("Sorted array is : Descending");
//		printArray(sortedArray);
		
		//Ascending
		bubbleSort.bubbleSort(givenArray);
		System.out.println("Sorted array is : Ascending");
		printArray(givenArray);
 
	}
 
	

	private static int[] takeInput() 
	{
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter "+size+" elements of the array");

		for(int i=0;i<array.length;i++) 
		{
			int element = sc.nextInt();
			array[i] = element;
		}
		return array;
	}

	private static void printArray(int[] array) 
	{
		for(int i =0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}


}
