package com.atishay.practice.string;

//String is Anagram when letters in both are same but sequence is different.
//Runtime complexity:O(n)
//Space Complexity: O(n)
//Ask interviewer whether String is full Upper case or Lower case
//or which character to handle etc.
public class IsStringAnagram {
	public static void main(String[] args) {
		// HashCode can't be used.
		System.out.println("atishay".hashCode() + " " + "atishay".hashCode());

		String str1 = "ac";
		String str2 = "bb";
		System.out.println(isAnagram(str1, str2));
	}

	private static boolean isAnagram(String s, String t) {

		// validations
		if (s == null || t == null) {
			return false;
		}

		if (s.length() != t.length()) {
			return false;
		}

		// Happy path.
		if (s.equalsIgnoreCase(t)) {
			return true;
		}

		// Special Case
		if ((s.equals("") && t.equals("")) || (s.equals(" ") && t.equals(" "))) {
			return true;
		}

		// 123: 97: a: Acii value +26 total characters
		// A: 65: Ascii value of A+26
		// Here,we are handling upper case and lower case character as well.
		int[] arr1 = new int[123];
		int[] arr2 = new int[123];

		for (int i = 0; i < s.length(); i++) {
			arr1[s.charAt(i)]++;
			arr2[t.charAt(i)]++;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}