package com.nag.mergesort;

public class Merging {

	/**
	 * Merging can happen on two sorted lists , and it will return a sorted list It
	 * is represent as O(m+n) , m+n indicates merging.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int[] merge(int[] a, int[] b) {

		if ((a != null && a.length > 0) && (b != null && b.length > 0)) {
			int[] c = new int[a.length + b.length];
			int i = 0, j = 0, k = 0;
			while ((i < a.length) && (j < b.length)) {
				if (a[i] < b[j]) {
					c[k++] = a[i++];
				} else {
					c[k++] = b[j++];
				}
			}
			for (; i < a.length; i++) {
				c[k++] = a[i];
			}
			for (; j < b.length; j++) {
				c[k++] = b[j];
			}
			return c;
		} else {
			return null;
		}
	}

}
