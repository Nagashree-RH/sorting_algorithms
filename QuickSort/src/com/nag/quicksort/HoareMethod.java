package com.nag.quicksort;

import java.util.Arrays;

public class HoareMethod {

	/**
	 * Quick sort uses divide and conquer stratergy, and in hoare method the index
	 * is included.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public void quickSort(int[] arr, int low, int high) {
		if (arr != null && arr.length > 0) {
			if (low >= high)
				return;

			int index = partition(arr, low, high);
			quickSort(arr, low, index);
			quickSort(arr, index + 1, high);

		}
	}

	/**
	 * In partition method, the pivot value will be the element present in low
	 * position and with respect to that value i and j are incremented and
	 * decremented respectively from both the ends, such that all elements left of
	 * pivot value will be less than it and on the right it will be more than pivot
	 * value.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private int partition(int[] arr, int low, int high) {

		int i = low - 1;
		int j = high + 1;
		int pivotValue = arr[low];
		while (i < j) {
			// i will increment till it finds value greater than or equal to pivot value
			do {
				i++;
			} while (arr[i] < pivotValue);

			// j will keep on decrementing untill it finds value less than or equal to pivot
			// value
			do {
				j--;
			} while (arr[j] > pivotValue);

			if (i < j) {
				swap(arr, i, j);
			}

		}
		swap(arr, low, j);
		System.out.println(Arrays.toString(arr));
		return j;
	}

	private void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
