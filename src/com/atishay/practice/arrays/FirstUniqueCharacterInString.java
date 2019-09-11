package com.atishay.practice.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

//RunTimeComplexity: O(n)
//HashMap: Get and Put RumTimeComplexity O(1)
public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		String s = "loveleetcode"; // ccddee //abccddeea
		findFirstUniqueCharacter(s);
	}

	private static void findFirstUniqueCharacter(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			// increment the count when you found the character.
			if (map.get(arr[i]) != null) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		Optional<Entry<Character, Integer>> opt = map.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.findFirst();
		if (opt.isPresent()) {
			System.out.println(opt.get().getKey());
		} else {
			System.out.println("-1");
		}
	}

}
