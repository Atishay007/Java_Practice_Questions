package com.atishay.practice.string;

public class ReverseStringUsingRecursion {
	public static void main(String[] args) {
		System.out.println(reverseString("atishay"));
	}

	private static String reverseString(String string) {
		if (string.length() == 1) {
			return string;
		}
		return reverseString(string.substring(1)) + string.charAt(0);
	}
}
