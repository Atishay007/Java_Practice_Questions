package com.atishay.practice.arrays;

public class FindDuplicateInArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 4, 1 };

		int[] countArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (countArr[arr[i]] == 1) {
				System.out.println(arr[i]);
				System.exit(0);
			} else {
				countArr[arr[i]]++;
			}
		}
		System.out.println(-1);
	}
}
