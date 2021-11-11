package com.nag.bubblesort;

public class BubbleSort {


	/**
	 * It will return the sorted array. It will be in ascending order.
	 * @param array
	 * @return
	 */
	public int[] bubbleSort(int[] array) 
	{

		for(int i = 0; i<array.length-1; i++)
		{
			for(int j = 0; j<array.length-1-i; j++)
			{
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public int[] bubbleSortDescending(int[] array) 
	{

		for(int i = 0; i<array.length-1; i++)
		{
			for(int j = 0; j<array.length-1-i; j++)
			{
				if(array[j]<array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}
