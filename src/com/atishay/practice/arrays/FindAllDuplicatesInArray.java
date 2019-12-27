package com.atishay.practice.arrays;

import java.util.HashSet;
import java.util.Set;

//Runtime Complexity: O(n)
//Space Complexity: O(n)
public class FindAllDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 4, 1, 9 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i])) { // Runtime Complexity of set.contains is O(1).
				set.add(arr[i]);
			} else {
				System.out.println(arr[i]);
			}
		}
	}
}
