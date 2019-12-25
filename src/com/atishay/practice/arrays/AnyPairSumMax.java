package com.atishay.practice.arrays;

//Asked in VmWare Interview Question.
//Runtime Complexity: O(n)
//Space complexity: O(1)
//Any pair whose sum is maximum.
//Pair will be of First max and Second max.
public class AnyPairSumMax {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 5, 3, 0, 0, 2 };
		int maxFirst = 0;
		int maxSecond = 0;

		for (int i = 0; i < arr.length; i++) {
			if (maxFirst < arr[i]) {
				maxSecond = maxFirst;
				maxFirst = arr[i];
			} else if (maxSecond < arr[i]) {
				maxSecond = arr[i];
			}
		}

		System.out.println("MaxFirst: " + maxFirst);
		System.out.println("MaxSecond: " + maxSecond);
		System.out.println("Pair of max sum: " + (maxFirst + maxSecond));
	}
}
