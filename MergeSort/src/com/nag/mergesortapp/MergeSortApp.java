package com.nag.mergesortapp;

import java.util.Scanner;

import com.nag.mergesort.MergeSortRecurssive;
import com.nag.mergesort.Merging;

public class MergeSortApp {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {

			System.out.println("Menu");
			System.out.println("1.Merge two lists");
			System.out.println("2.Sort the given list");
			System.out.println("3.Exit");
			System.out.println("Enter the option");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Please enter two sorted lists: \n");
				int[] a = takeArrayInput();
				int[] b = takeArrayInput();

				Merging merge = new Merging();
				int[] result = merge.merge(a, b);

				System.out.println("Merged array");
				printArray(result);
				break;

			case 2:
				// Calling mergeSort
				System.out.println("Please enter an unsorted list: \n");
				int[] c = takeArrayInput();

				System.out.println("Unsorted array : ");
				printArray(c);

				MergeSortRecurssive mergeSortRecurssive = new MergeSortRecurssive();
				mergeSortRecurssive.mergeSort(c, 0, c.length - 1);

				System.out.println("Sorted Aray : ");
				printArray(c);
				break;
			case 3:
				sc.close();
				System.exit(0);
			default:
				System.out.println("Wrong input");
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

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
