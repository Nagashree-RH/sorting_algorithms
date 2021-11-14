package com.nag.insertionsortapp;

import java.util.Scanner;

import com.nag.insertionsort.InsertionSort;

public class InsertionSortApp {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		// take array input
		int[] arr = takeArrayInput();

		System.out.println("Given array :");
		printArray(arr);

		InsertionSort insertionSort = new InsertionSort();

		// for ascending order
		insertionSort.insertionSortMethod(arr);

		// for descending order
//		insertionSort.insertionSortMethodDescending(arr);

		System.out.println("Array in sorted order is :");
		printArray(arr);

		sc.close();
	}

	private static int[] takeArrayInput() {
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements of the array");

		for (int i = 0; i < array.length; i++) {
			int element = sc.nextInt();
			array[i] = element;
		}
		return array;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
