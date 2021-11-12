package com.nag.quicksort_app;

import java.util.Arrays;
import java.util.Scanner;

import com.nag.quicksort.HoareMethod;
import com.nag.quicksort.QuickSort;

public class QuickSortApp {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		while (true) {
			System.out.println("Menu");
			System.out.println("1.Lomuto method");
			System.out.println("2. Hoare method");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				int[] arr = takeArrayInput();
				System.out.println("Unsorted array is");
				printArray(arr);
				QuickSort quickSort = new QuickSort();
				quickSort.quickSort(arr, 0, arr.length - 1);
				System.out.println("Sorted array is ");
				printArray(arr);
				break;
			case 2:
				int[] arr1 = takeArrayInput();
				System.out.println("Unsorted array is ");
				printArray(arr1);
				HoareMethod hoare = new HoareMethod();
				hoare.quickSort(arr1, 0, arr1.length - 1);
				System.out.println("Sorted array is ");
				printArray(arr1);
				break;
			case 3:
				sc.close();
				System.exit(0);

			default:
				System.out.println("Wrong choice");

			}

		}

	}

	private static int[] takeArrayInput() {

		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

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
