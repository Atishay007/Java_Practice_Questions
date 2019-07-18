package com.atishay.practice.arrays;

import java.util.Arrays;

public class ArrayRotationRightEasy {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		// Array Should be rotated 2 times.
		int n = 2;
		int j = 0;
		while (j < n) {
			int temp = arr[arr.length-1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			j++;
		}

		Arrays.stream(arr).forEach(System.out::print);
	}
}
