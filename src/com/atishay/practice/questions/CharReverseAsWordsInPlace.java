package com.atishay.practice.questions;

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

		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			char temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}

		System.out.println("New Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		int startCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				for (int k = startCount, l = i - 1; k < l; k++, l--) {
					char temp = arr[k];
					arr[k] = arr[l];
					arr[l] = temp;
				}
				startCount = i + 1;
			}
		}

		// For reversing last word.
		for (int k = startCount, j = arr.length - 1; k < j; k++, j--) {
			char temp = arr[k];
			arr[k] = arr[j];
			arr[j] = temp;
		}

		System.out.println(" ");
		System.out.println("Reversed: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
