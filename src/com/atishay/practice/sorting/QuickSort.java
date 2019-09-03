package com.atishay.practice.sorting;

import java.util.Arrays;

//RunTime Complexity(O(n log n)) , worst case O(n2).
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 1 };

		quickSort(arr, 0, arr.length - 1);

		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void quickSort(int[] arr, int startIndex, int endIndex) {
		// It is like Pre Order Traversal: Root= Where work is done, left , right
		if (startIndex < endIndex) {
			int partitionIndex = getPartitionIndex(arr, startIndex, endIndex);

			// left Partition
			quickSort(arr, startIndex, partitionIndex - 1);
			// right Partition
			quickSort(arr, partitionIndex + 1, endIndex);
		}
	}

	// Most Crucial Part.
	private static int getPartitionIndex(int[] arr, int startIndex, int endIndex) {
		int pivot = arr[endIndex];
		int pivotIndex = startIndex;
		for (int i = startIndex; i <= endIndex; i++) {
			if (arr[i] <= pivot) {
				swap(arr, pivotIndex, i);
				pivotIndex++;
			}
		}
		// This is mandatory to reduced the partition.
		return --pivotIndex;
	}

	private static void swap(int[] arr, int pivotIndex, int i) {
		int temp = arr[i];
		arr[i] = arr[pivotIndex];
		arr[pivotIndex] = temp;
	}
}
