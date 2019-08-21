package com.atishay.practice.arrays;

//Runtime: O(n)
//Using XOR to find missing no from 2 almost identical Array.
//Array can be sorted or unsorted but elements will be same.
public class FindMissingNoFrom2Array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		int x1 = arr[0];
		for (int i = 1; i < arr.length; i++) {
			x1 = x1 ^ arr[i];
		}

		int x2 = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			x2 = x2 ^ arr2[i];
		}

		System.out.println("No Missing: " + (x1 ^ x2));
	}
}
