package com.atishay.practice.arrays;

import java.util.Arrays;

//This was a first time solution
//A poor solution.
public class ArrayRotationRight {
	public static void main(String[] args) {
		int tempLast = 0;
		int tempCurrent = 0;

		int[] arr = { 1, 2, 3, 4 };
		// Array Should be rotated 2 times.
		int n = 2;
		int j = 0;
		while (j < n) {
			for (int i = 1; i < arr.length; i++) {
				if (i == 1) {
					tempLast = arr[i];
					arr[i] = arr[i - 1];
				} else {
					tempCurrent = arr[i];
					arr[i] = tempLast;
					tempLast = tempCurrent;
				}
			}
			arr[0] = tempLast;

			Arrays.stream(arr).forEach(System.out::print);
			System.out.println();
			j++;
		}
	}
}
