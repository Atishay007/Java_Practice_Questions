package com.atishay.practice.string;

//This can be done 2 ways.
//1. Rotate the string each time and then check whether it is a substring or not.
//2. Second solution is below, using indexOf
public class RotatedSubString {
	public static void main(String[] args) {
		String name = "baeldung";
		String concatString = name + name;

		if (name.length() == 1) {
			System.out.println("String length is 1");
		}
		if (name.equalsIgnoreCase(concatString)) {
			System.out.println("Both Strings are same");
		}

		System.out.println(isStringSubString(concatString, name));
	}

	private static boolean isStringSubString(String concatString, String name) {
		//Excluding first char else the String is same.
		int result = concatString.indexOf(name, 1);
		if (result != -1) {
			return true;
		}
		return false;
	}
}
