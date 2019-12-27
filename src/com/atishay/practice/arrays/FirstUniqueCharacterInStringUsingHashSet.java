package com.atishay.practice.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

//RunTimeComplexity: O(n)
//Space Complexity: O(n)
//LinkedHashSet:Add and remove is O(1): To Maintain Insertion order.
public class FirstUniqueCharacterInStringUsingHashSet {

	public static void main(String[] args) {
		String s = "loveleetcode"; // ccddee //abccddeea
		findFirstUniqueCharacter(s);
	}

	private static void findFirstUniqueCharacter(String str) {
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (set.contains(temp)) {
				set.remove(temp);
			} else {
				set.add(temp);
			}
		}

		Object[] arr = set.toArray();
		System.out.println(arr[0]);
	}
}
