package com.atishay.practice.arrays;

import java.util.Arrays;

//RunTime Complexity: O(n)
//Space Complexity: O(1)
public class MoveZeroes {
	public static void main(String[] args) {
		int[] nums = { 1, 0, 0, 3, 12 };
		moveZeroes(nums);
		Arrays.stream(nums).forEach(System.out::print);
	}

	public static void moveZeroes(int[] nums) {
		int leftIndex = 0;
		if (nums[0] != 0) {
			leftIndex++;
		}
		for (int i = 1; i < nums.length; i++) {
			if (nums[leftIndex] != 0) {
				leftIndex++;
				continue;
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
