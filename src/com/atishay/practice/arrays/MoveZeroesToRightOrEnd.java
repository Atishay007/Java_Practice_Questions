package com.atishay.practice.arrays;

import java.util.Arrays;

//2 Pointer Algorithm.
//RunTime Complexity: O(n)
//Space Complexity: O(1)
public class MoveZeroesToRightOrEnd {
	public static void main(String[] args) {
		int[] nums = { 1, 0, 0, 3, 12 };
		moveZeroesToRight(nums);
		Arrays.stream(nums).forEach(System.out::print);
	}

	public static void moveZeroesToRight(int[] nums) {
		int leftIndex = 0;
		if (nums[0] != 0) {
			leftIndex++;
		}
		for (int i = 1; i < nums.length; i++) {
			if (nums[leftIndex] != 0) {
				leftIndex++;
			} else {
				if (nums[i] != 0) {
					int temp = nums[i];
					nums[i] = nums[leftIndex];
					nums[leftIndex] = temp;
					leftIndex++;
				}

			}
		}
	}
}
