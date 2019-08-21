package com.atishay.search.algo;

//Runtime O(log n)
//Requirement: Array should be sorted.
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int noToFind = 8;

		// Finding No.
		findNo(arr, noToFind);

	}

	private static void findNo(int[] arr, int noToFind) {
		int low = 0;
		int high = arr.length - 1;
		boolean noFound = false;

		while (low <= high) {
			int pivot = (low + high) / 2;

			if (arr[pivot] > noToFind) {
				high = pivot - 1;
			} else if (arr[pivot] < noToFind) {
				low = pivot + 1;
			} else {
				System.out.println("No. Found: " + arr[pivot]);
				noFound = true;
				break;
			}
		}

		if (!noFound) {
			System.out.println("Ohh no, No. not Present");
		}

	}
}
