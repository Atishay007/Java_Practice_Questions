package com.atishay.practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//Here, if the interview ask to make runtime complexity as: O(n)
//But space complexity can be O(n).
//Runtime Complexity:O(n)
//Space Complexity: O(n)
public class FindMissingPositiveNoSolution2 {
	public static void main(String[] args) {
		int[] nums = { 2, 1 };

		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] arr) {
		int missingNo = 0;

		// Adding elements to the hashSet O(n)
		// Instead of using this traditional loop use Java 8 Stream.
		// for (int i = 0; i < arr.length; i++) { hashSet.add(arr[i]); }

		// It returns new HashSet.
		// Boxed method is necessary as it will convert primitive int to Integer wrapper
		// class.
		// Streams follows Builder Pattern which is a Creational Design Pattern.
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

		// Finding first missing positive no.
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(missingNo)) {
				return missingNo;
			}
			missingNo++;
		}
		return missingNo;
	}
}
