package com.atishay.practice.arrays;

import java.util.HashSet;
import java.util.Set;

//Runtime Complexity: O(n)
//Space Complexity: O(n)
public class GetCountOfNonDuplicatesUsingHashSet {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int[] nums = { -1, -1, -2, 0 };
		System.out.println(getCountOfDuplicates(nums));
		System.out.println(System.currentTimeMillis() - startTime + " ms");
	}

	public static int getCountOfDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				set.remove(arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
		return set.size();
	}
}