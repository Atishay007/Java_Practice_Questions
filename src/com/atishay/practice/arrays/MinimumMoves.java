package com.atishay.practice.arrays;

//How Many moves needed to make arr1 to be like arr2.
//Rule: No Ordering of the elements are allowed.
//One move is defined as 1 increment or decrement by one of each digit of the items.
//This question was asked in Neptune:Pune Coding Test
//Time Complexity:O(n2)
//Space Complexity:O(1)
public class MinimumMoves {
	public static void main(String[] args) {
		int[] arr1 = { 123, 543 };
		int[] arr2 = { 321, 279 };

		int totalMoves = 0;

		for (int i = 0; i < arr1.length; i++) {
			String str1 = String.valueOf(arr1[i]);
			String str2 = String.valueOf(arr2[i]);

			for (int j = 0; j < str1.length(); j++) {
				int no1 = Integer.parseInt(String.valueOf(str1.charAt(j)));
				int no2 = Integer.parseInt(String.valueOf(str2.charAt(j)));
				if (no1 > no2) {
					totalMoves = totalMoves + (no1 - no2);
				} else if (no2 > no1) {
					totalMoves = totalMoves + (no2 - no1);
				}
			}
		}

		System.out.println(totalMoves);
	}
}
