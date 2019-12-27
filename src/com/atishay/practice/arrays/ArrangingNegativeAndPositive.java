package com.atishay.practice.arrays;

import java.util.Arrays;

//RunTime O(n)
//It is a 2 pointer solution
//Here pivotIndex is used as slow pointer.
//Space Complexity: O(1)
public class ArrangingNegativeAndPositive {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, -1, 0, -2, 1 };
		int windowStart = 0;
		// This plays an important role
		// If there are all positive no, then it will become 0.
		// Used differently in QuickSort.
		int pivot = -1;

		for (int i = 0; i < arr.length; i++) {
			// Ascending order.
			if (arr[i] <= pivot) {
				swap(arr, windowStart, i);
				windowStart++;
			}
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void swap(int[] arr, int windowStart, int i) {
		int temp = arr[i];
		arr[i] = arr[windowStart];
		arr[windowStart] = temp;
	}
}
