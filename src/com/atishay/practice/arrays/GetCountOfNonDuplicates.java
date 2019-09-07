package com.atishay.practice.arrays;

//Runtime O(n)
//Using BinarySearch
public class GetCountOfNonDuplicates {
	public static void main(String[] args) {
		int[] nums = { -1, -1, -1, -2, 0 };
		System.out.println(getCountOfDuplicates(nums));
	}

	public static int getCountOfDuplicates(int[] nums) {
		// special case
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;

		int uniqueNoCount = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != binarySearch(nums, i + 1, nums.length - 1, nums[i])) {
				uniqueNoCount++;
			}
		}
		return uniqueNoCount;
	}

	// Recursive Binary Search
	private static int binarySearch(int[] nums, int start, int end, int noToFind) {

		if (start <= end) {
			int pivot = (start + end) / 2;

			if (nums[pivot] > noToFind) {
				return binarySearch(nums, start, pivot - 1, noToFind);
			} else if (nums[pivot] < noToFind) {
				return binarySearch(nums, pivot + 1, end, noToFind);
			} else {
				int temp = nums[pivot];
				nums[pivot] = -1;
				return temp;
			}
		}
		return 0;
	}
}