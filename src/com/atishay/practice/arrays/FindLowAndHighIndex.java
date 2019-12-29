package com.atishay.practice.arrays;

import java.util.Arrays;

//Runtime Complexity:O(n)
//Space Complexity:O(n)
//If there are million of nos. then this is a poor solution,
//we have to use O(log n): BinarySearch.
public class FindLowAndHighIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 20 };
		int key = 20;
		printLowAndHighIndex(arr, key);
	}

	private static void printLowAndHighIndex(int[] arr, int key) {
		int startIndex = -2;
		int endIndex = -2;

		// Edge case if key didn't present, print -1.
		// BinarySearch returns index of the key.
		// O(log n):Can be used only when array is sorted.
		int index = Arrays.binarySearch(arr, 0, arr.length, key);
		if (index < 0) {
			System.out.println("Key no present: " + -1);
			System.exit(0);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				if (startIndex == -2) {
					startIndex = i;
				}
				endIndex = i;
			}
			// if current element > key, means key will not be present afterwards
			// as array is sorted in ascending order.
			if (arr[i] > key) {
				break;
			}
		}

		System.out.println("Low Index: " + startIndex);
		System.out.println("High Index: " + endIndex);
	}

}
