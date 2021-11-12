package com.nag.selectionsort_app;

import java.util.Scanner;

import com.nag.selectionsort.SelectionSort;

public class SelectionSortApp {

	public static void main(String[] args) {
		int[] arr = takeArrayInput();
		
	    System.out.println("Given array is :");
	    printArray(arr);
	    
		SelectionSort selectionSort = new SelectionSort();
		
		//For ascending
//		selectionSort.selectionSort(arr);
		
		//For descending
		selectionSort.selectionSortDescending(arr);
		
		System.out.println("Sorted array is :");
	    printArray(arr);

	}
	
	private static int[] takeArrayInput() {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0 ; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
