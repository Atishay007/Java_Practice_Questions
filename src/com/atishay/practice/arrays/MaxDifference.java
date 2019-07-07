package com.atishay.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxDifference {
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(7, 9, 5, 6, 3, 2);
		System.out.println(maxDifference(arr));
	}

	public static int maxDifference(List<Integer> arr) {
		List<Integer> maxDiff = new ArrayList<>();

		// validations
		if (arr == null || arr.isEmpty()) {
			return -1;
		}

		for (int i = 1; i < arr.size(); i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr.get(j) >= 0 && (arr.get(i) > arr.get(j))) {
					maxDiff.add(arr.get(i) - arr.get(j));
				}
			}
		}

		if (!maxDiff.isEmpty()) {
			maxDiff.sort((x, y) -> y - x);
			return maxDiff.get(0);
		}
		return -1;
	}
}
