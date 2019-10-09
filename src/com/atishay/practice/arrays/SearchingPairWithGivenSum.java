package com.atishay.practice.arrays;

/*Two pointers is really an easy and effective technique which is typically used for searching pairs 
 * in a sorted array.
Given a sorted array A(sorted in ascending order),having N integers,find if there exists 
any pair of elements(A[i],A[j])such that their sum is equal to X.*/

//RunTime Complexity O(n)
public class SearchingPairWithGivenSum {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 35, 50, 75, 80 };
		// Sum to find to pair
		int sum = 70;

		System.out.println(isPairSum(arr, 0, arr.length - 1, sum));
	}

	private static boolean isPairSum(int[] arr, int start, int end, int sumToFind) {
		if (start < end) {
			if (arr[start] + arr[end] == sumToFind)
				return true;

			if (arr[start] + arr[end] > sumToFind) {
				return isPairSum(arr, start, end - 1, sumToFind);
			} else if (arr[start] + arr[end] < sumToFind) {
				return isPairSum(arr, start + 1, end, sumToFind);
			}
		}
		return false;
	}
}
