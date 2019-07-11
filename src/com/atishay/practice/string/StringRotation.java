package com.atishay.practice.string;

import java.util.ArrayList;
import java.util.List;

//Remaining Question.
public class StringRotation {
	public static void main(String[] args) {
		String rotated = "dabc";
		String original = "abcd";
		// original = original + original;

		// Validations
		// 1.If there is length difference between 2 Strings, then String is not rotated
		// 2. If both Strings are equal then there is no use of rotation.

		List<String> lst = new ArrayList<>();

		char[] arr = original.toCharArray();
		int j = 0;

		// We need 2 variables
		char tempLast = 0;
		char tempCurrent = 0;

		// Array Should be rotated and save according to length of the String.
		// There will be 2 loops
		while (j < original.length() - 1) {
			for (int i = 1; i < arr.length; i++) {
				// always remember this case
				if (i == 1) {
					tempLast = arr[i];
					arr[i] = arr[i - 1];
				} else {
					tempCurrent = arr[i];
					arr[i] = tempLast;
					tempLast = tempCurrent;
				}
			}
			arr[0] = tempLast;
			// adding all possible rotations of the String.
			lst.add(String.valueOf(arr));
			j++;
		}

		System.out.println("Printing all possible rotations of the String");

		lst.forEach(System.out::println);

		if (lst.contains(rotated)) {
			System.out.println("String is rotated");
		} else {
			System.out.println("String is not rotated");
		}

	}

}
