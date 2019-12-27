package com.atishay.practice.arrays;

import java.util.Arrays;

//Here, if the interview ask to make Space complexity as O(1).
//Runtime Complexity:O(n log n)
//Space Complexity: O(1)
public class FindMissingPositiveNoSolution1 {
	public static void main(String[] args) {
		int[] nums = { 3, 0, 1, 2 };
		// Arrays should be sorted for Binary Search.
		Arrays.sort(nums); // O(n log n)

		System.out.println(missingNumber(nums));
	}

	// Binary Search(O log n) doing N times - O(n log n)
	public static int missingNumber(int[] nums) {
		int i = 0;
		for (; i < nums.length; i++) {
			if (Arrays.binarySearch(nums, 0, nums.length, i) < 0) {
				return i;
			}
		}
		return i;
	}
}
