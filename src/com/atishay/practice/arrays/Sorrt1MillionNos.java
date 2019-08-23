package com.atishay.practice.arrays;

//Sorting 1 million no ranging from 1 to 9 in O(n).
//This is a Bucket Sort.
public class Sorrt1MillionNos {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 4, 1, 2, 8, 2, 2 };
		// sending min and max element present.
		int[] arr2 = sortArray(arr, 8);
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i]; j++) {
				System.out.print(i);
			}
		}
	}

	private static int[] sortArray(int[] arr, int max) {
		int[] arr2 = new int[max + 1];

		// Incrementing the count of digits, according to index.
		// This logic is under O(n) times.
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]]++;
		}
		return arr2;
	}
}
