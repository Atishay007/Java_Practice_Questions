package com.atishay.practice.questions;

public class CharReverseAsWords {
	public static void main(String[] args) {
		char[] arr = { 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't',
				'i', 'c', 'e' };

		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		System.out.println();
		System.out.println("New Array");
		String st = new String(arr);
		String[] str = st.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i].toCharArray());
			if (i != 0) {
				System.out.print(" ");
			}
		}
	}
}
