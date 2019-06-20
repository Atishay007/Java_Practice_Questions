package com.atishay.practice.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Finding all Substring of a String
//Finding Smallest and largest substring along with specific size.
public class AllSubString {
	public static void main(String[] args) {
		String s = "welcometojava";
		List<String> lst = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				lst.add(s.substring(i, j));
			}
		}

		List<String> newLst = lst.stream().filter(a -> a.length() == 3).collect(Collectors.toList());
		Collections.sort(newLst);
		System.out.println(newLst.get(0));
	}
}
