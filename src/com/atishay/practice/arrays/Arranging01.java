package com.atishay.practice.arrays;

import java.util.Arrays;

//Time Complexity : O(n)
//It is a 2 pointer solution
//Here pivotIndex is used as slow pointer.
//Space Complexity is: O(1)
public class Arranging01 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 1, 1 };
		//
		int windowStart = 0;

		int pivot = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= pivot) {
				swap(arr, windowStart, i);
				windowStart++;
			}
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void swap(int[] arr, int windoStart, int i) {
		int temp = arr[i];
		arr[i] = arr[windoStart];
		arr[windoStart] = temp;
	}

}
