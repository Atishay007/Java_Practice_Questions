package com.atishay.practice.arrays;

import java.util.Arrays;

//Runtime Complexity: O(n)
//Space Complexity: O(1)
//InPlace reversing of the char array.
//1. Reverse the whole String
//2. Reverse the word on their place.
public class CharReverseAsWordsInPlace {
	public static void main(String[] args) {
		char[] arr = { 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't',
				'i', 'c', 'e' };

		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		System.out.println("");

		// O(n)
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			char temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}

		int i = 0;
		int j = 0;

		// O(n)
		for (; i < arr.length; i++) {
			if (arr[i] == ' ') {
				swapChar(arr, j, i);
				j = i + 1;
			}

			// Swapping last word.As last word doesn't have space.
			if (i == arr.length - 1) {
				swapChar(arr, j, i + 1); // O(n)
			}
		}

		System.out.println(" ");
		System.out.println("Reversed: ");
		System.out.println(Arrays.toString(arr));
	}

	// O(n)
	private static void swapChar(char[] arr, int startIndex, int lastIndex) {
		--lastIndex;
		for (; startIndex <= lastIndex; startIndex++, lastIndex--) {
			char temp = arr[startIndex];
			arr[startIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
		}
	}
}
