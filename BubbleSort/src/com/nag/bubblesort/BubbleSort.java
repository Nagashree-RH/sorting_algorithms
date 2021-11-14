package com.nag.bubblesort;

public class BubbleSort {

	/**
	 * In bubble sort it will compare each element with its next element and swap it
	 * such that if it is ascending, the biggest element will be at the last by the
	 * end of one j loop. it goes on sorting like that till the entire list is
	 * sorted. The array is sorted in asceding order.
	 * 
	 * @param array
	 * 
	 */
	public void bubbleSort(int[] array) {

		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
	}

	/**
	 * It will sort the array in descending order
	 * 
	 * @param array
	 * 
	 */
	public void bubbleSortDescending(int[] array) {
		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j] < array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
	}
}
