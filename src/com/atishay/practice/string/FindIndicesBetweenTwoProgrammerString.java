package com.atishay.practice.string;

import java.util.ArrayList;
import java.util.List;

//Program to find no. of Indices or gaps between 2 programmer strings.
// Programmer String can be in any random char.
public class FindIndicesBetweenTwoProgrammerString {
	public static void main(String[] args) {
		String s = "xprogxrmaxemrppprmmograeiruu";

		int result = programmerStrings(s);
		System.out.println(result);

	}

	public static int programmerStrings(String s) {
		if (s.length() < 1 || s.length() > 100000) {
			return 0;
		}
		char[] arr = s.toCharArray();
		List<Character> lstChar = createArray();
		int originalLength = 10;
		int count = 0;
		boolean startingPoint = false;
		int i = 0;
		boolean stringFound = false;
		for (; i < s.length(); i++) {
			if (!startingPoint && !lstChar.contains(arr[i])) {
				continue;
			}

			if (lstChar.contains(arr[i])) {
				count++;
				startingPoint = true;
			}

			if (count == originalLength) {
				stringFound = true;
				break;
			}
		}

		if (!stringFound) {
			return 0;
		}

		stringFound = false;
		startingPoint = false;
		count = 0;

		int j = s.length() - 1;
		for (; j > i; j--) {
			if (!startingPoint && !lstChar.contains(arr[j])) {
				continue;
			}

			if (lstChar.contains(arr[j])) {
				count++;
				startingPoint = true;
			}

			if (count == originalLength) {
				stringFound = true;
				break;
			}
		}
		j--;

		if (!stringFound || j <= i) {
			return 0;
		}

		return j - i;
	}

	private static List<Character> createArray() {
		char[] arr = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'e', 'r' };
		List<Character> lst = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
		}
		return lst;
	}
}