package com.nag.insertionsort;

public class InsertionSort {

	/**
	 * In insertion sort, the first element is considered as sorted , and from the
	 * second element onwards the loop starts and inserts the element in the right
	 * position resulting in a sorted array
	 * 
	 * @param arr
	 * @return
	 */
	public void insertionSortMethod(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 1; i < arr.length; i++) {
				int value = arr[i];
				int hole = i;
				while (hole > 0 && arr[hole - 1] > value) {
					arr[hole] = arr[hole - 1];
					hole--;
				}
				arr[hole] = value;
			}

		}

	}

	/**
	 * The array is sorted in descending order.
	 * 
	 * @param arr
	 */
	public void insertionSortMethodDescending(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 1; i < arr.length; i++) {
				int value = arr[i];
				int hole = i;
				while (hole > 0 && arr[hole - 1] < value) {
					arr[hole] = arr[hole - 1];
					hole--;
				}
				arr[hole] = value;
			}

		}

	}
}
