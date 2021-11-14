
package com.nag.selectionsort;

public class SelectionSort {

	/**
	 * In selection sort of asceding order, the smallest value position is found in
	 * each pass and arranged accordingly
	 * 
	 * @param arr
	 */
	public void selectionSort(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length - 1; i++) {

				int pos = i;

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[pos] > arr[j]) {
						pos = j;
					}
				}
				swap(arr, i, pos);
			}
		}
	}

	public void selectionSortDescending(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length - 1; i++) {

				int pos = i;

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[pos] < arr[j]) {
						pos = j;
					}
				}
				swap(arr, i, pos);
			}
		}
	}

	/**
	 * Function written to swap two values
	 * 
	 * @param arr
	 * @param i
	 * @param j
	 */
	private void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
