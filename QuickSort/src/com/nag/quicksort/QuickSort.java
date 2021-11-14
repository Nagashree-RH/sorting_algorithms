package com.nag.quicksort;

public class QuickSort {

	/**
	 * It will recursively call itself, till the list is sorted
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 */
	public void quickSort(int[] arr, int start, int end) {
		if (arr != null && arr.length > 0) {
			if (start >= end) {
				return;
			}

			int index = partition(arr, start, end);
			quickSort(arr, start, index - 1);
			quickSort(arr, index + 1, end);
		}
	}

	/**
	 * It will partition the array into two halves ,such that with respect to the
	 * pivot value taken all less than pivot value is on the LHS and all values
	 * greater the pivot value is on RHS
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public int partition(int[] arr, int start, int end) {

		int pivotIndex = start;
		int pivotValue = arr[end];
		for (int i = start; i < end; i++) {

			if (arr[i] < pivotValue) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			}

		}
		swap(arr, pivotIndex, end);
		return pivotIndex;
	}

	/**
	 * It will swap two values in the array
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
