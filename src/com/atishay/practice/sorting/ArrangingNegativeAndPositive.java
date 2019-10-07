package com.atishay.practice.sorting;

import java.util.Arrays;

//RunTime O(n)
public class ArrangingNegativeAndPositive {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, -1, 0, -2, 1 };
		int pivotIndex = 0;
		// This plays an important role
		// If there are all positive no, then it will become 0.
		// Used differently in QuickSort.
		int pivot = -1;

		for (int i = 0; i < arr.length; i++) {
			// Ascending order.
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotIndex];
				arr[pivotIndex] = temp;
				pivotIndex++;
			}
		}

		Arrays.stream(arr).forEach(System.out::print);
	}
}
