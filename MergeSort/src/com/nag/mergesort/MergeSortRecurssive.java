package com.nag.mergesort;

public class MergeSortRecurssive {

	/**
	 * Merge sort uses divide and conquer startergy, and calls itself recurssively
	 * untill the problem is divided into small problem like to one element.
	 * 
	 * @param a
	 * @param low
	 * @param high
	 */
	public void mergeSort(int[] a, int low, int high) {
		if (a != null && a.length > 0) {
			if (low < high) {
				int mid = low + (high - low) / 2;
				mergeSort(a, low, mid);
				mergeSort(a, mid + 1, high);
				merge(a, low, mid, high);
			}

		}
	}

	/**
	 * In merging the list is divided into two halves and compared and merged giving
	 * sorted list
	 * 
	 * @param a
	 * @param low
	 * @param mid
	 * @param high
	 */
	private void merge(int[] a, int low, int mid, int high) {
		// The array will be divided into sub arrays, till mid one array and mid+1 to
		// high another array
		int leftArraySize = mid - low + 1;
		int rightAraySize = high - mid;

		// Declare and initialize the left and right array
		int[] leftArray = new int[leftArraySize];
		int[] rightArray = new int[rightAraySize];

		// The elements are copied into the array
		for (int i = 0; i < leftArraySize; i++) {
			leftArray[i] = a[low + i];
		}

		for (int j = 0; j < rightAraySize; j++) {
			rightArray[j] = a[mid + 1 + j];
		}

		// compare the two array and put the elements into right position
		int i = 0, j = 0, k = low;

		while ((i < leftArraySize) && (j < rightAraySize)) {

			if (leftArray[i] < rightArray[j]) {
				a[k++] = leftArray[i++];
			} else {
				a[k++] = rightArray[j++];
			}
		}

		// Copy the remaining elements of the leftArray
		for (; i < leftArraySize; i++) {
			a[k++] = leftArray[i];
		}
		for (; j < rightAraySize; j++) {
			a[k++] = rightArray[j];
		}
	}

}
