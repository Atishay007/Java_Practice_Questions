package com.atishay.practice.arrays;

import java.util.Arrays;

//Runtime Complexity: O(n * no. of times to shift)
//Space Complexity: O(1)
public class ArrayRotationLeft {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		// Array Should be rotated 2 times.
		int n = 2;
		int j = 0;
		while (j < n) {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
			j++;
		}

		System.out.println(Arrays.toString(arr));
	}
}
