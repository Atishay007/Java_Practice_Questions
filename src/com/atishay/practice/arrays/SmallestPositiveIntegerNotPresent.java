package com.atishay.practice.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//This question is about finding smallest positive Integer not present in an array.
public class SmallestPositiveIntegerNotPresent {
	public static void main(String[] args) {
		int[] arr = {-1,1,2,3,7};
		Arrays.sort(arr);
		// boxed will convert int into Integer.
		List<Integer> lst = Arrays.stream(arr).filter(b -> b > 0).boxed().collect(Collectors.toList());

		// 1 is the smallest positive integer
		// if 1 is not present then simply return 1
		if (!lst.contains(1)) {
			System.out.println(1);
			return;
		}

		int smallestPositiveNo = 2;

		for (int i = 0; i < arr.length; i++) {
			if (!lst.contains(smallestPositiveNo)) {
				System.out.println(smallestPositiveNo);
				break;
			}
			smallestPositiveNo++;
		}

	}
}
