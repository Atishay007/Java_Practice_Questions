package com.atishay.practice.sorting;

import java.util.Arrays;

//Time Complexity : O(n)
public class Arranging01 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 1, 1 };
		int pivotIndex = 0;
		// This plays an important role.
		// If there are negative no, then it will become -1.
		// This plays vital role in Quick Sort.
		int pivot = 0;

		for (int i = 0; i < arr.length; i++) {
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
