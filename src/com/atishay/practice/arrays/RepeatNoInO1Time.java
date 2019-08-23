package com.atishay.practice.arrays;

//Finding Repeated no.
//it uses O(1) space and O(n) time complexity.
//NOTE:

//It will not work if array has 0 or negative no.
//It will also not work if array has no not matching to its index.
//ex: {3,4,1}: Will not work
public class RepeatNoInO1Time {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 3, 6, 6 };

		for (int i = 0; i < arr.length; i++) {
			// Using Math.abs to mark negative no.
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println(Math.abs(arr[i]));
			}
		}

	}
}
