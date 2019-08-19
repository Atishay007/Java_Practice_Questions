package com.atishay.practice.arrays;

import java.util.Arrays;

//O(n): Time complexity
//0 is not a positive integer, it is neutral.
public class FirstMissingPositiveInteger {
	public static void main(String[] args) {
		// int[] arr = { 1, 8, 2, 6, 4 };
		int[] arr = { 1, 1, 1 };

		if (arr.length == 1 && arr[0] == 1) {
			System.out.println(2);
		}

		if (arr.length == 1 && arr[0] <= 0) {
			System.out.println(1);
		}

		Arrays.sort(arr);

		int[] arr2 = new int[arr[arr.length - 1] + 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0)
				continue;
			arr2[arr[i]]++;
		}

		int i;
		for (i = 1; i < arr2.length; i++) {
			if (arr2[i] == 0) {
				System.out.println(i);
				System.exit(0);
				break;
			}
		}
		System.out.println(i);

	}
}
