package com.atishay.practice.arrays;

public class MaxSumContiguousSubArray {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int globalValue = arr[0];
		int localValue = arr[0];

		for (int i = 1; i < arr.length; i++) {
			localValue = Math.max(arr[i], arr[i] + localValue);
			if (localValue > globalValue) {
				globalValue = localValue;
			}
		}

		System.out.println(globalValue);
	}
}
