package com.atishay.practice.arrays;

//This was the first time solution.
//A Poor Solution.
public class ArrayRotationLeft {
	public static void main(String[] args) {
		int tempLast = 0;
		int tempCurrent = 0;

		int[] arr = { 1, 2, 3, 4 };
		// Array Should be rotated 2 times.
		int n = 2;
		int j = 0;
		// no of times we have to shift.
		while (j < n) {
			for (int i = arr.length - 2; i >= 0; i--) {
				if (i == arr.length - 2) {
					tempLast = arr[i];
					arr[i] = arr[i + 1];
				} else {
					tempCurrent = arr[i];
					arr[i] = tempLast;
					tempLast = tempCurrent;
				}
			}
			arr[arr.length - 1] = tempLast;

			j++;
		}
	}
}
