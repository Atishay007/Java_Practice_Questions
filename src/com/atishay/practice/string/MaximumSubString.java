package com.atishay.practice.string;

import java.util.ArrayList;
import java.util.List;

//Runtime Complexity: O(n2)
//Space Complexity:O(n)
//Given a String, determine its alphabetically maximum substring.
public class MaximumSubString {
	public static void main(String[] args) {
		String s = "baca";
		List<String> lst = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			// Here we have to keep the length as equal to s.length()
			// as we have done j=i+1
			for (int j = i + 1; j <= s.length(); j++) {
				lst.add(s.substring(i, j));
			}
		}

		// Sorting, and brining max substring on top.
		// compareTo sort the string lexicographically.
		lst.sort((a, b) -> b.compareTo(a));

		System.out.println(lst.get(0));
	}
}
