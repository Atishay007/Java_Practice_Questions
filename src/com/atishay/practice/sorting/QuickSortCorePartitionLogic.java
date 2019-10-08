package com.atishay.practice.sorting;

import java.util.Arrays;

//This is the core logic of Quick Sort.
//All the no to pivot are shifted to left and right.
public class QuickSortCorePartitionLogic {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 8, 2 };
		int pivotIndex = 0;
		int pivot = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			// All no less than Pivot will be on left side.
			// Nos greater than Pivot will be on right side.
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
