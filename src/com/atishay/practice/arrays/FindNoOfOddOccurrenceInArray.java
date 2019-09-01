package com.atishay.practice.arrays;

//O(1) space and O(n) time complexity.
//Using XOR
public class FindNoOfOddOccurrenceInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4 };
		// Initialize this with 0.
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		System.out.println("No which is oddly present: " + result);
	}
}
